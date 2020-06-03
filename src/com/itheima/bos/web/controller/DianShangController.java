package com.itheima.bos.web.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.itheima.bos.web.VO.*;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.DianShangService;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.EasyExcelUtils;
import com.itheima.bos.web.utils.ExcelListener;
import com.itheima.bos.web.utils.GetUUID;

import com.sun.corba.se.impl.oa.toa.TOA;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class DianShangController {
    @Autowired
    DianShangService dianShangService;
    //页面跳转
    @RequestMapping(value="/dians_kclr.action")//库存页面
    public String kclr() {
        return "dianshang/kucun_input";
    }
    @RequestMapping(value="/taobao_order_info.action")//淘宝订单页面
    public String taobao_order_info() {
        return "dianshang/taobao_input";
    }
    @RequestMapping(value="/pdd_order_info.action")//拼多多订单页面
    public String pdd_order_info() {
        return "dianshang/pdd_input";
    }
    @RequestMapping(value="/dians_lirun.action")//利润页面
    public String lirun() {
        return "dianshang/lirun";
    }
    @RequestMapping(value="/dians_tbsdxx.action")//淘宝刷单页面
    public String taobao_sd() {
        return "dianshang/taobao_sd";
    }
    @RequestMapping(value="/dians_pddsdxx.action")//拼多多刷单页面
    public String pdd_sd() {
        return "dianshang/pdd_sd";
    }
    @RequestMapping(value="/dians_kdxx.action")//快递信息页面
    public String other_info() { return "dianshang/kuaidi_input"; }
    @RequestMapping(value="/dians_dsrz.action")//查看记录页面
    public String find_jilu() {
        return "dianshang/jilu";
    }
    @RequestMapping(value = "/dians_xhxx.action")
    public  String xinghaoxinxi() {
        return "dianshang/xhxx";
    }
    @RequestMapping(value = "/dians_dpgl.action")
    public  String showStore() {
        return "dianshang/storemanager";
    }


    /**
     * 查询库存信息
     */
    @RequestMapping("/dianShang_findAllDsStock.action")
    @ResponseBody
    public List<DsStock> findAllDsStock(){
        List<DsStock> list = dianShangService.findAllDsStock();
        return list;
    }

    /**
     * 删除库存信息
     */
    //@RequiresPermissions()
    @RequestMapping("/dianShang_deleteDsKucun.action")
    public String deleteDsKucun(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            dianShangService.deleteDsKucun(split);
        }
        return "dianshang/kucun_input";
    }

    /**
     * 添加库存信息
     */
    @RequestMapping("/dianShang_addStock.action")
    @ResponseBody
    public String addStock(DsStock dsStock, String typename, String typeno, String brand, int num){
        int row  = dianShangService.saveStock(dsStock,typename,typeno,brand,num);
        return "dianshang/kucun_input";
    }
    /**\
     * 库存信息-更新库存信息
     */
    @RequestMapping("/dianShang_updateStockInfo.action")
    @ResponseBody
    public String updateStockInfo(DsStock dsStock){
        if(null == dsStock){
            return "0";
        }
        int row = dianShangService.updateStockInfo(dsStock);
        return row+"";
    }


    /**
     * 快递页面
     */
    /**
     * 查询快递信息
     */
    @RequestMapping("/dianShang_findAllKuaidi.action")
    @ResponseBody
    public List<DsExpress> findAllKuaidi(){
        List<DsExpress> list = dianShangService.findAllKuaidi();
        return list;
    }

    /**
     * 添加快递信息
     */
    @RequestMapping("/dianShang_addKuaidi.action")
    @ResponseBody
    public void addKuaidi(DsExpress dsExpress, String province, String expressname, BigDecimal expresscost, HttpServletResponse response)throws Exception{
        int row  = dianShangService.saveKuaidi(dsExpress,province,expressname,expresscost);
        response.getWriter().print(row);
//        return "dianshang/kuaidi_input";
    }
    /**
     * 删除快递信息
     */
    @RequestMapping("/dianShang_deleteKuaidi.action")
    public String deleteKuaidi(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            dianShangService.deleteKuaidi(split);
        }
        return "dianshang/kuaidi_input";
    }
    /**
     * 快递信息-编辑快递信息
     */
    @RequestMapping("/dianShang_updateKuaidiInfo.action")
    @ResponseBody
    public String updateKuaidiInfo(DsExpress dsExpress){
        if(dsExpress == null){
            return "0";
        }
        int row = dianShangService.updateKuaidiInfo(dsExpress);
        return row+"";
    }



    /**
     * 型号页面
     */
    /**
     * 查询型号信息
     */
    @RequestMapping("/dianShang_findXinghaoxinxi.action")
    @ResponseBody
    public List<DsModelinfo> findXinghaoxinxi(){
        List<DsModelinfo> list = dianShangService.findXinghaoxinxi();
        return list;
    }
    /**
     * 添加型号信息
     */
    @RequestMapping("/dianShang_addXinghaoxinxi.action")
    @ResponseBody
    public String addXinghaoxinxi(DsModelinfo dsModelinfo){
        int row  = dianShangService.saveXinghaoxinxi(dsModelinfo);
        return row+"";
    }
    /**
     * 删除型号信息
     */
    @RequestMapping(value = "/dianShang_deleteXinghaoxinxi.action")
    public String deleteXinghaoxinxi(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            dianShangService.deleteXinghaoxinxi(split);
        }
        return "dianshang/xhxx";
    }


    /**
     * 日志页面
     */
    /**
     * 查询日志信息
     */
    @RequestMapping("/dianShang_findAllMessage.action")
    @ResponseBody
    public PageBean<DsMessage> findAllMessage(VoMessage voMessage,Integer rows,Integer page){
        //获得当前时间
        if(voMessage.getBegintime()==""){
            voMessage.setBegintime(DateUtils.getLastMonth());
        }
        if(voMessage.getEndtime()==""){
            voMessage.setEndtime(DateUtils.getCrudate());
        }
        PageBean<DsMessage> pageBean = new PageBean<DsMessage>();
        pageBean.setCruPage(page);
        pageBean.setPageSize(rows);
        //List<MyOrdersproduct> list = salesManService.selectOrderRecordNum(user.getId(),voOrderRecorde,crudate,lastMonth);

        PageBean message = dianShangService.findMessage(voMessage, pageBean);
        return message;
    }



    /**
     * 显示淘宝订单
     */
    @RequestMapping(value = "/dianShang_findAllTBorder.action")
    @ResponseBody
    public List<DsTborder> findAllTBorder(String storeId, String beginTime, String endTime){
        if(storeId == "" || beginTime == "" || endTime == ""){
            return null;
        }

        String crudateBegin = beginTime+" 00:00:00";
        String crudateEnd = endTime+" 23:59:59";
        List<DsTborder> list = dianShangService.findAllTBorder(storeId,crudateBegin,crudateEnd);
        return list;
    }

    /**
     * 型号信息-修改型号信息
     */
    @RequestMapping(value = "/dianShang_updateOrderInfo.action")
    @ResponseBody
    public int updateOrderInfo(String row){
        DsModelinfo dsModelinfo = JSON.parseObject(row,DsModelinfo.class);
        int rowres = dianShangService.updateOrderInfo(dsModelinfo);
        return rowres;
    }
    @RequestMapping("/dianShang_findAllStore.action")
    @ResponseBody
    public List<DsStore> findAllStroe(){
        List<DsStore> list = dianShangService.findAllStroe();
        return list;
    }

    /**
     * 店铺管理-删除店铺
     * @param ids
     * @return
     */
    @RequestMapping("/dianShang_deleteStore.action")
    public String deleteStore(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            dianShangService.deleteStore(split);
        }
        return "dianshang/storemanager";
    }
    /**
     * 店铺管理-修改店铺
     */
    @RequestMapping("/dianShang_updateStore.action")
    @ResponseBody
    public String updateStore(DsStore dsStore){
        if (null == dsStore){
            return "0";
        }
        int row = dianShangService.updateStore(dsStore);
        return row+"";
    }
    /**
     * 店铺管理-添加店铺
     */
    @RequestMapping("/dianShang_addStoreInfo.action")
    @ResponseBody
    public String addStore(DsStore dsStore){
        if (null == dsStore){
            return "0";
        }
        int row = dianShangService.addStore(dsStore);
        return row+"";
    }



    /**
     * 导入订单
     */
    @RequestMapping( value = "/dianShang_inputTaobaoOrder.action",method = RequestMethod.POST)
    @ResponseBody
    public MessagerData inputOrder(@RequestParam(value="file",required=false) MultipartFile myFile, String storeId ) throws Exception{
        int row = 0;
        int count = 0;
        int errorcount = 0;
        int reorder = 0;
        String context = "";
        MessagerData data = new MessagerData();
        try {
            InputStream input = null;
            List<Object> lists = null;
            if (myFile.isEmpty()) {
                data.setStatus(401);
                data.setMessage("请选择上传文件！！！");
                return data;
            } else {
                // 如果错误为0
                String fileName = myFile.getOriginalFilename();
                int index = fileName.lastIndexOf(".");
                String substring = fileName.substring(index+1);
                input = myFile.getInputStream();
                // 解析每行结果在listener中处理
                ExcelListener listener = new ExcelListener();
                Object excelType = null;
                ExcelReader excelReader = null;
                if ("xlsx".equals(substring)) {
                    excelReader = new ExcelReader(input,ExcelTypeEnum.XLSX,listener);
                }else{
                    data.setMessage("请上传xlsx格式的excel");
                    data.setStatus(400);
                    return data;
                }
//                ExcelReader excelReader = new ExcelReader(input,excelType,null ,listener);
                excelReader.read(new Sheet(1, 1,TaoBaoVO.class));
                lists = listener.getDatas();
                // 循环将excel中的数据存入库
                for (Object list : lists) {
                    TaoBaoVO taoBaoVO = (TaoBaoVO) list;
                    if (StringUtils.isEmpty(taoBaoVO.getOrderid())){
                        continue;
                    }
                    String ordersid = taoBaoVO.getOrderid();
                    int tborderById = dianShangService.findTborderById(ordersid);
                    if(tborderById == 1){
                        reorder++;
                        context += "<br/>"+ordersid;
                        continue;
                    }
                    DsTborder dsTborder = new DsTborder();
                    dsTborder.setId(GetUUID.getUUID());
                    dsTborder.setTotalorderid(storeId);
                    dsTborder.setFixcost(new BigDecimal(0));
                    dsTborder.setInstallcost(new BigDecimal(0));
                    dsTborder.setZacost(new BigDecimal(0));
                    dsTborder.setOrderid(ordersid);
                    dsTborder.setReceiver(taoBaoVO.getReceiver());
                    dsTborder.setPaymoney(taoBaoVO.getPaymoney());
                    dsTborder.setOrdermark(taoBaoVO.getOrdermark());
                    dsTborder.setCustomermark(taoBaoVO.getCustomermark());
                    dsTborder.setCustomervipname(taoBaoVO.getCustomervipname());
                    dsTborder.setReceiveraddr(taoBaoVO.getReceiveraddr());
                    dsTborder.setLxphone(taoBaoVO.getLxphone());
                    dsTborder.setOrderpaytime(taoBaoVO.getOrderpaytime());
                    dsTborder.setBbnum(taoBaoVO.getBbnum());
                    dsTborder.setProductattr(taoBaoVO.getProductattr());
                    dsTborder.setSendexpress(taoBaoVO.getSendexpress());

                    dsTborder.setZacost(new BigDecimal(taoBaoVO.getZacost()));
                    dsTborder.setInstallcost(new BigDecimal(0));
                    dsTborder.setFixcost(new BigDecimal(0));

                    //根据商品型号查询成本
                    if (StringUtils.isNotEmpty(dsTborder.getProductattr())){
                        BigDecimal modelCost = dianShangService.findModelCost(dsTborder.getProductattr());
                        dsTborder.setCost(modelCost.multiply(new BigDecimal(dsTborder.getBbnum())));
                    }else {
                        dsTborder.setCost(new BigDecimal(0));
                    }
                    String shengfen = dsTborder.getReceiveraddr();
                    String[] split = shengfen.split(" ");

                    if (StringUtils.isEmpty(dsTborder.getSendexpress()) || "空包".equals(dsTborder.getSendexpress())){
                        dsTborder.setSendexpress("空包");
                        dsTborder.setExpresscost(new BigDecimal(0));
                    }else{
                        BigDecimal kuaidiCost = dianShangService.findKuaidiCost(split[0],dsTborder.getSendexpress());
                        if (null == kuaidiCost){
                            dsTborder.setExpresscost(new BigDecimal(0));
                        }else {
                            dsTborder.setExpresscost(kuaidiCost);
                        }
                    }
                    row = dianShangService.saveTbOrder(dsTborder);
                    if(row == 1){
                        count++;
                    }else {
                        errorcount++;
                    }
                }
            }
            data.setStatus(200);
            data.setMessage("成功导入："+count+"条<br/>导入失败："+errorcount+"条<br/>存在重复订单："+reorder+"条  <br/> 重复订单为："+context);
            return  data;
        } catch (Exception e) {
            e.printStackTrace();
           // addMessage(redirectAttributes, "导入文件异常请检查Excel文件！");
            data.setStatus(500);
            data.setMessage("解析文件出错！");
            return data;
        }
    }
    /**
     * 删除订单
     * @param ids
     * @return
     */
    @RequestMapping("/dianShang_deleteTaobaoOrder.action")
    public String deleteTaobaoOrder(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            dianShangService.deleteTaobaoOrder(split);
        }
        return "dianshang/taobao_input";
    }

    /**
     *
     * @param row
     * @return
     */
    @RequestMapping(value = "/dianShang_updateInputTaobaoOrder.action")
    @ResponseBody
    public int updateInputTaobaoOrder(String row){
        DsTborder dsTborder = JSON.parseObject(row,DsTborder.class);
        int rowres = dianShangService.updateInputTaobaoOrder(dsTborder);
        return rowres;
    }
    /**
     * 利润-查询利润
     */
    @RequestMapping("/dianShang_findLiRunByQ.action")
    @ResponseBody
    public DataVo findLiRunByQ(String storeid, String profittime, String storetype){
        DataVo dataVo = dianShangService.findLiRunByQ(storeid,profittime,storetype);
        return dataVo;
    }
    /**
     * 利润-查询店铺名称
     */
    @RequestMapping("/dianShang_findStoreNameByTypeId.action")
    @ResponseBody
    public List<DsStore> findStoreNameByTypeId(String id){
        List<DsStore> list = dianShangService.findStoreNameByTypeId(id);
        return list;
    }
    /**
     *根据店铺id，日期：查询直通车数
     */
    @RequestMapping("/dianShang_findStraightNum.action")
    @ResponseBody
    public DsStraightcart findStraightNum(String storeId, String time){
        if(null == storeId || time == null ||time == ""){
            return null;
        }
        String crudateBegin = time+" 00:00:00";
        String crudateEnd = time+" 23:59:59";
        DsStraightcart dsStraightcart = dianShangService.findStraightNum(storeId,crudateBegin,crudateEnd);
        if(dsStraightcart == null){
            dsStraightcart = new DsStraightcart();
            dsStraightcart.setNum(0.0);
        }
        return dsStraightcart;
    }

    /**
     * 修改直通车数
     * @param storeId
     * @param num
     */
    @RequestMapping("/dianShang_updateStraightNum.action")
    @ResponseBody
    public MessagerData updateStraightNum(String storeId,String time ,String num){
        MessagerData messagerData = new MessagerData();
        double num1 = 0;
        try {
            num1 = Double.parseDouble(num.trim());
        }catch (Exception e){
            messagerData.setStatus(400);
            return messagerData;
        }

        if(null == storeId || null == time ){
             messagerData.setStatus(400);
             return messagerData;
        }
        String crudateBegin = time+" 00:00:00";
        String crudateEnd = time+" 23:59:59";
        int row = dianShangService.updateStraightNum(storeId,crudateBegin,crudateEnd,num1);
        messagerData.setStatus(row);
        return messagerData;
    }

    @RequestMapping("/dianShang_countShuaDanCost.action")
    @ResponseBody
    public ProfitVo countShuaDanCost(String storeId, String time){
        if(null == storeId || time == null){
            return null;
        }
        String crudateBegin = time+" 00:00:00";
        String crudateEnd = time+" 23:59:59";
        ProfitVo profitVo = dianShangService.countShuaDanCost(storeId,crudateBegin,crudateEnd);
       return profitVo;
    }
    /**
     * 淘宝刷单
     */
    @RequestMapping(value = "/dianShang_findAllShuaDanTBorder.action")
    @ResponseBody
    public List<DsTborder> findAllShuaDanTBorder(String storeId, String beginTime,String endTime){
        if(storeId == null || beginTime == null || endTime == null){
            return null;
        }
        String crudateBegin = beginTime+" 00:00:00";
        String crudateEnd = endTime+" 23:59:59";
        List<DsTborder> list = dianShangService.findAllShuaDanTBorder(storeId,crudateBegin,crudateEnd);
        return list;
    }
    /**
     * 删除淘宝刷单信息
     */
    @RequestMapping("/dianShang_deleteShuadanTaobaoOrder.action")
    public String eleteShuadanTaobaoOrder(String ids){
        if(null != ids){
            String[] split = ids.split(",");
            dianShangService.deleteTaobaoOrder(split);
        }
        return "dianshang/taobao_sd";
    }

    @RequestMapping({"/dianshang_findOrderBackInfo.action"})
    @ResponseBody
    public PageBean findOrderBackInfo(VoOrderBack voOrderBack,PageBean pageBean) {
        String crudate = DateUtils.getCrudate();
        String lastMonth = DateUtils.getLastMonth();
        PageBean orderBackInfo = this.dianShangService.findOrderBackInfo(crudate, lastMonth, voOrderBack, pageBean);
        return orderBackInfo;
    }


    @RequestMapping({"/index_addOrderBackInfo.action"})
    @ResponseBody
    public MessagerData addOrderBackInfo(String p) {
        Orderback orderback = (Orderback)JSON.parseObject(p, Orderback.class);
        MessagerData messagerData = new MessagerData();
        if (orderback == null) {
            messagerData.setMessage("网络错误或者信息不完全");
            messagerData.setStatus(400);
            return messagerData;
        } else {
            int row1 = this.dianShangService.addOrderBack(orderback);
            if (row1 == 1) {
                messagerData.setStatus(200);
                messagerData.setMessage("添加成功");
                return messagerData;
            } else {
                messagerData.setMessage("添加失败");
                messagerData.setStatus(400);
                return messagerData;
            }
        }
    }

    @RequestMapping({"/dianshang_updateOrderBackToReject.action"})
    @ResponseBody
    public MessagerData updateOrderBackSignOrReject(Orderback orderback) {
        MessagerData messagerData = new MessagerData();
        if (null != orderback && null != orderback.getSignstatu() && !"".equals(orderback.getSignstatu().trim())) {
            Staff staff = (Staff) SecurityUtils.getSubject().getPrincipal();
            orderback.setBasename(staff.getUsername());
            int row = this.dianShangService.updateOrderBackSignOrReject(orderback);
            if (row == 1) {
                if (orderback.getSignstatu().equals("签收")) {
                    messagerData.setMessage("签收成功！");
                } else {
                    messagerData.setMessage("拒签成功！");
                }
            } else if (orderback.getSignstatu().equals("签收")) {
                messagerData.setMessage("签收失败！");
            } else {
                messagerData.setMessage("拒签失败！");
            }

            return messagerData;
        } else {
            messagerData.setMessage("错误，请重新刷新页面！");
            return messagerData;
        }
    }

    @RequestMapping({"/dianshang_updateOrderRefund.action"})
    @ResponseBody
    public MessagerData updateOrderRefund(Orderback orderback) {
        MessagerData messagerData = new MessagerData();
        if (null != orderback && !"".equals(orderback.getHandlereason().trim())) {
            Staff staff = (Staff)SecurityUtils.getSubject().getPrincipal();
            orderback.setHandlename(staff.getUsername());
            orderback.setHandletime(new Date());
            int row = this.dianShangService.updateOrderRefund(orderback);
            if (row == 1) {
                if (orderback.getHandlereason().equals("同意退款")) {
                    messagerData.setMessage("同意退款成功！");
                } else {
                    messagerData.setMessage("拒绝退款成功！");
                }
            } else if (orderback.getHandlereason().equals("拒绝退款")) {
                messagerData.setMessage("拒绝退款失败！");
            } else {
                messagerData.setMessage("同意退款失败！");
            }

            return messagerData;
        } else {
            messagerData.setMessage("错误，请重新刷新页面！");
            return messagerData;
        }
    }

}
