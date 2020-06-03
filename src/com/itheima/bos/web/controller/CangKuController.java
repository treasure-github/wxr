package com.itheima.bos.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.itheima.bos.web.VO.MessagerData;
import com.itheima.bos.web.mapper.OrdersproductMapper;
import com.itheima.bos.web.mapper.SumnoMapper;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.AdminService;
import com.itheima.bos.web.service.CangKuService;
import com.itheima.bos.web.service.SumnoService;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.GetUUID;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class CangKuController {

    @Autowired
    CangKuService cangKuService;
    @Autowired
    AdminService adminService;
    @Autowired
    OrdersproductMapper ordersproductMapper;

    @Autowired
    SumnoService sumnoService;

    /**
     * @Description: <退货订单>
     * @Param
     * @Return java.lang.String
     */
    @RequestMapping("/goods_rejected.action")
    public String goodsRejected() {
        return "cangg/goods_rejected";
    }


    /**
     * 通过类别id获得型号
     */
    @RequestMapping("/canggfindtypeno.action")
    @ResponseBody
    public List<Typeno> findTypenoById(String id) {
        List<Typeno> list = cangKuService.findTypenoById(id);
        return list;
    }

    /**
     * 通过类别id获得
     * 品牌
     */
    @RequestMapping("/canggfindbrand.action")
    @ResponseBody
    public List<Brand> findBrandById(String id) {
        List<Brand> list = cangKuService.findBrandById(id);
        return list;
    }

    /**
     * 添加库存数据
     */
    @RequestMapping("/cangg_kclradd.action")
    public void saveStock(Stock stock, String typename, String typeno, String brandid, String address, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //添加id
        stock.setId(GetUUID.getUUID());
        stock.setStockdate(new Date());
        int row = cangKuService.saveStock(stock, typename, typeno, brandid, address);
        response.getWriter().print(row);
//        return "cangg/kucun_add";
    }

    /**
     * 查询库存数据
     */
    @RequestMapping("/cangKu_findStrock.action")
    @ResponseBody
    public PageBean<Stock> findAllStock(String q, Integer page, Integer rows) {

        PageBean<Stock> pageBean = new PageBean<Stock>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        List<Stock> list = cangKuService.findAllStockByq(pageBean, q);
        pageBean.setRows(list);
        return pageBean;
    }

    /**
     * 查看库存来货记录数据，默认显示当月数据
     */
    @RequestMapping("/lhjl_findInputRecord.action")
    @ResponseBody
    public PageBean<Stock> findInputRecorde(String q, Integer page, Integer rows) {
        PageBean<Stock> pageBean = new PageBean<Stock>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        //获得当月的数据
        List<Stock> list = cangKuService.findInputRecord(pageBean, q);
        pageBean.setRows(list);
        return pageBean;
    }

    /**
     * 查询业务员货物单
     */
    @RequestMapping("/cangg_showYWYHWD.action")
    @ResponseBody
    public List<MyOrders> findAllNotFinishOrder(String q) {
        List<MyOrders> list = cangKuService.findAllNotFinishOrder(q);
        return list;
    }
    //182.61.32.198:3306

    /**
     * 将选中的订单查询其有的所有数据
     */
    @RequestMapping("/cangKu_showOrderProductById.action")
    @ResponseBody
    public List<Ordersproduct> findAllOrdersproductById(String id) {
        List<Ordersproduct> list = cangKuService.findAllOrdersproductById(id);
        //对得到的数据进行处理
        for (Ordersproduct ordersproduct : list) {
            //更改需求量
            ordersproduct.setNum(ordersproduct.getNum() - ordersproduct.getSdnum());
            //将实到数置为0
            ordersproduct.setSdnum(0);
        }
        return list;
    }

    /**
     * 货物到了，添加货物
     */
    @RequestMapping("/cangKu_updateOrderProduct.action")
    @ResponseBody
    public Integer updateOrderProduct(String row) {
        List<Ordersproduct> list = JSON.parseArray(row, Ordersproduct.class);
        //将实到数量进行
        int resrow = cangKuService.updateOrderProduct(list);
        return resrow;
    }

    /**
     * 显示订单来货记录页面
     */
    @RequestMapping("/cangg_base_dhlhjl.action")
    public String showDDLHJL() {
        return "cangg/orderinputrecord";
    }

    /**
     * 查询来货记录表
     */
    @RequestMapping("/cangKu_findOrderInputRecord.action")
    @ResponseBody
    public PageBean<Orderinputrecord> findOrderInputRecord(String q, Integer page, Integer rows) {
        PageBean<Orderinputrecord> pageBean = new PageBean<Orderinputrecord>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        pageBean.setRows(cangKuService.findOrderInputRecord(pageBean, q));
        return pageBean;
    }

    /**
     * 显示出货打单记录
     */
    @RequestMapping("/cangg_base_chdd.action")
    public String showCHDD() {
        return "cangg/orderoutput";
    }

    /**
     * 通过id查询出需要打单的数据
     *
     * @return
     */
    @RequestMapping("/cangKu_dd_showOrderProductById.action")
    @ResponseBody
    public List<Ordersproduct> dd_showOrderProductById(String id) {
        List<Ordersproduct> list = cangKuService.findAllOrdersproductById(id);
        //预先处理计算出发货数目，
        for (Ordersproduct ordersproduct : list) {
            ordersproduct.setSdnum(ordersproduct.getSdnum() - ordersproduct.getSendnum());
        }
        return list;
    }

    /**
     * 打单出货
     *
     * @param row
     * @return
     */
    @RequestMapping("/cangKu_dd_updateOrderProduct.action")
    @ResponseBody
    public MessagerData dd_updateOrderProduct(String row, HttpServletRequest request) {
        List<Ordersproduct> list = JSON.parseArray(row, Ordersproduct.class);
        TreeSet ts = new TreeSet();
        for (int i = 0; i < list.size(); i++) {
            ts.add(list.get(i).getId());
        }
        MessagerData messagerData = new MessagerData();
        if (ts.size() != list.size()) {
            messagerData.setStatus(400);
            return messagerData;
        }
        //判断选中的订单是否已经获取过单号
        boolean flag = cangKuService.isPrintNo(list);
        if (flag) {
            messagerData.setStatus(400);
            messagerData.setMessage("已经打印订单！");
            return messagerData;
        }
        //获得打单号，用户信息
        Sumno sumno = sumnoService.findSumno();
        int resrow = cangKuService.dd_updateOrderProduct(list, sumno);

        //添加一条打单记录


        request.setAttribute("status", resrow);
        if (resrow != 0 && list.size() > 0) {
            Staff user = (Staff) SecurityUtils.getSubject().getSession().getAttribute("loginUser");
            Operationrecord operationrecord = new Operationrecord();
            operationrecord.setId(GetUUID.getUUID());
            operationrecord.setUsername(user.getUsername());
            operationrecord.setMessager(user.getUsername() + "进行打单商品，其单号为：" + list.get(0).getOrdersid());
            operationrecord.setMenutype("出货打单");
            operationrecord.setOprationtype("打单");
            operationrecord.setOprationtime(new Date());
            adminService.insertOperationRecord(operationrecord);
            messagerData.setStatus(200);
            messagerData.setMessage("打单成功，订单号：" + sumno.getPrintorderno());
            return messagerData;
        }
        messagerData.setStatus(400);
        messagerData.setMessage("网络出现问题，请重新刷新！");
        return messagerData;
    }

    /**
     * 查看出货记录
     */
    @RequestMapping("/cangKu_showOutputRecord.action")
    @ResponseBody
    public PageBean<MyOrdersproduct> showOutputRecord(Integer page, Integer rows, String q) {
        PageBean<MyOrdersproduct> pageBean = new PageBean<MyOrdersproduct>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        cangKuService.showOutputRecord(pageBean, q);
        return pageBean;
    }

    /**
     * 查看库存转订单的所有记录，可以离线条件查询
     */
    @RequestMapping("/cangKu_findStock2OrderRecord.action")
    @ResponseBody
    public PageBean<Stock2orderrecord> findStock2OrderRecord(Integer page, Integer rows, String q) {
        PageBean<Stock2orderrecord> pageBean = new PageBean<Stock2orderrecord>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        cangKuService.findStock2OrderRecord(pageBean, q);
        return pageBean;

    }

    /**
     * 跳转库存转订单记录页面
     */
    @RequestMapping("/cangg_base_kczddjl.action")
    public String showStock2Orderrecord() {
        return "cangg/stock2orderrecord";
    }

    /**
     * 更改库存转订单记录的处理情况信息
     */
    @RequestMapping("/cangKu_changeStock2OrderrecordWCQK.action")
    @ResponseBody
    public Integer changeStock2OrderrecordWCQK(String id, String wcqk) {
        Stock2orderrecord stock2orderrecord = new Stock2orderrecord();
        stock2orderrecord.setId(id);
        stock2orderrecord.setWcqk(wcqk);
        int row = cangKuService.changeStock2OrderrecordWCQK(stock2orderrecord);
        return row;
    }

    /**
     * 更改订单转库存的信息。
     */
    @RequestMapping("/cangKu_changeOrder2StockrecordWCQK.action")
    @ResponseBody
    public Integer changeOrder2StockrecordWCQK(String id, String wcqk) {
        Order2stockrecord order2stockrecord = new Order2stockrecord();
        order2stockrecord.setId(id);
        order2stockrecord.setWcqk(wcqk);
        int row = cangKuService.changeOrder2StockrecordWCQK(order2stockrecord);
        return row;
    }

    /**
     * 跳转订单转库存页面
     */
    @RequestMapping("/cangg_base_ddzkcjl.action")
    public String showDDZKCJL() {
        return "cangg/order2stockrecord";
    }

    /**
     * 查询订单转库存记录
     */
    @RequestMapping("/cangKu_findOrderToStockRecord.action")
    @ResponseBody
    public PageBean<Order2stockrecord> findOrderToStockRecord(Integer page, Integer rows, String q) {
        PageBean<Order2stockrecord> pageBean = new PageBean<Order2stockrecord>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        cangKuService.findOrderToStockRecord(pageBean, q);
        return pageBean;

    }

    /**
     * 在打单记录中，出货
     *
     * @param row
     * @param wlno
     * @param skfs
     */
    @RequestMapping("/cangKu_ch_updateOrderProduct.action")
    public void ch_updateOrderProduct(String row, String wlno, String skfs, HttpServletResponse response) throws Exception {
        List<Outputrecord> list = JSON.parseArray(row, Outputrecord.class);
        int rows = cangKuService.ch_updateOrderProduct(list, wlno, skfs);
//        处理前台数据和实体类 数据类型不一致
        List list2 = JSON.parseArray(row);
        Map map = null;
        int i = 0;
        if (rows != 0 && list.size() > 0) {
            Staff user = publicOperationRecord();
            Operationrecord operationrecord = new Operationrecord();
            //TODO 是同一个订单号？多条数据处理只拿第一个id号吗
            Ordersproduct ordersIdByProductId = cangKuService.getOrdersIdByProductId(list.get(0).getId());
            int sum = 0;
            for (Object object : list2) {
                map = (Map)object;
                sum += Integer.parseInt(map.get("outputnum")+"");
            }
            if (ordersIdByProductId != null) {
                operationrecord.setMessager(user.getUsername() + "进行了出货,订单号为：" + ordersIdByProductId.getOrdersid() + "，出货数量为：" + sum + ",物流单号：" + wlno + ",收款方式：" + skfs);
            }
            operationrecord.setMenutype("打单记录");
            operationrecord.setOprationtype("出货");
            operationrecord.setOprationtime(new Date());
            //TODO 参数的id是什么,自动生成的？
            int i1 = adminService.insertOperationRecord(operationrecord);
        }
        response.getWriter().print(rows);
    }

    /**
     * 删除库存来货记录
     */
    @RequiresPermissions("delete-inputrecord")
    @RequestMapping("/cangg_deleteInputRecord.action")
    public String deleteInputRecord(String ids) {
        if (null != ids) {
            String[] split = ids.split(",");
            cangKuService.deleteInputRecord(split);
        }
        return "cangg/inputrecord";
    }

    /**
     * 删除库存来货记录
     */
    @RequiresPermissions("delete-showkucun")
    @RequestMapping("/cangg_deleteShowKucun.action")
    public String deleteShowKucun(String ids) {
        if (null != ids) {
            String[] split = ids.split(",");
            cangKuService.deleteShowKucun(split);
        }
        return "cangg/showkucun";
    }

    public Staff publicOperationRecord() {
        Staff user = (Staff) SecurityUtils.getSubject().getSession().getAttribute("loginUser");
        return user;
    }


}
