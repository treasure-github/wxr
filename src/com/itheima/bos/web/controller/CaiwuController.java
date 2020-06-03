package com.itheima.bos.web.controller;

import com.itheima.bos.web.VO.MessagerData;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.CaiwuService;
import com.itheima.bos.web.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CaiwuController {

    @Autowired
    CaiwuService caiwuService;


    /**
     * 显示财务的排单信息页面
     */
    @RequestMapping("/caiwu_pdxx.action")
    public String caiwu_pdxx(){
        return "caiwu/caiwu_pdxx";
    }

    @RequestMapping("/caiwu_cdxx.action")
    public String caiwu_cdxx(){
        return "caiwu/outputorderno";
    }

    /**
     * 获得出货单号信息
     */
    @RequestMapping("/caiwu_findPrintInfo.action")
    @ResponseBody
    public PageBean<Printrecored> findPrintInfo(String q, Integer page, Integer rows){
        PageBean<Printrecored> pageBean = new PageBean<Printrecored>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        pageBean.setRows(caiwuService.findPrintInfo(pageBean,q));
        return pageBean;
    }
    /**
     *出货单号作废处理
     */
    @RequestMapping("/caiwu_isDeletePrintNO.action")
    @ResponseBody
    public MessagerData isDeletePrintNO(String[] ids){
        MessagerData messagerData = new MessagerData();
        if(ids == null){
            messagerData.setStatus(400);
            return null;
        }
        int row = 0;
        for (String id : ids) {
            row = caiwuService.isDeletePrintNO(id);
        }
        if(row == 0){
            messagerData.setStatus(400);
            return null;
        }else{
            messagerData.setStatus(200);
            messagerData.setMessage("订单已作废！");
            return messagerData;
        }
    }
    /**
     * 默认查询一个月订单数，降序查询
     */
    @RequestMapping("/caiwu_findAllOrder.action")
    @ResponseBody
    public List<MyOrdersproduct> findAllOrderByQ(VoOrderRecorde voOrderRecorde){
        long cu = System.currentTimeMillis();
        //获得现在的时间和上一个月的时间
        String crudate = DateUtils.getCrudate();
//        String lastMonth = DateUtils.getLastMonth();
        String lastMonth = DateUtils.getLastTenDay();
        List<MyOrdersproduct> list =  caiwuService.findAllOrderByQ(crudate,lastMonth,voOrderRecorde);
        double sumprice = Double.parseDouble(list.get(0).getLessprice().toString());
        //记录同一个订单的下标
        int beginIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getOrdersid() .equals(list.get(i-1).getOrdersid())){
                sumprice += Double.parseDouble(list.get(i).getLessprice().toString());
            }else {
                for (int j = i-1;j>=beginIndex;j--){
                    list.get(j).setSumprice(sumprice);
                }
                beginIndex = i;
                sumprice = Double.parseDouble(list.get(i).getLessprice().toString());


            }
        }
        System.out.println(System.currentTimeMillis()-cu+"=============");
        return list;
    }

    /**
     * 更新订单尾款信息
     */
    @RequestMapping("/caiwu_updateOderInfo.action")
    @ResponseBody
    public MessagerData updateOrderInfo(String ordersid,Orders orders){
        MessagerData messagerData = new MessagerData();
        if(ordersid == null|| orders == null){
            messagerData.setMessage("修改失败！");
            messagerData.setStatus(400);
            return messagerData;
        }
        orders.setId(ordersid);
        int row = caiwuService.updateOrderInfo(orders);
        if(row == 1){
            messagerData.setStatus(200);
            messagerData.setMessage("修改成功");
        }else{
            messagerData.setStatus(400);
            messagerData.setMessage("修改失败！！");
        }
        return messagerData;
    }

}
