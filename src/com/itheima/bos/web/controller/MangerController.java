package com.itheima.bos.web.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.itheima.bos.web.VO.ToFactoryVO;
import com.itheima.bos.web.pojo.*;
import com.itheima.bos.web.service.ManagerService;
import com.itheima.bos.web.utils.DateUtils;
import com.itheima.bos.web.utils.FileUtils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

@Controller
public class MangerController {
    @Autowired
    ManagerService managerService;
	/**
	 * 显示员工的客户
	 * @return
	 */
	@RequestMapping("/mgr_base_staffcustomer.action")
	public String showStaffCustomer(){
		return "common/wait";
	}
	/**
	 * 显示员工信息
	 */
	@RequestMapping("/mgr_base_staffinfo.action")
	public String showStaffInfo(){

	    return "manager/staffinfo";
	}
	/**
	 * 显示订单
	 */
	@RequestMapping("/mgr_order_ordershow.action")
	public String showOrder(){
		return "manager/showorder";
	}
	/**
	 * 员工业绩
	 * @return
	 */
	@RequestMapping("mgr_performance_staffperf.action")
	public String staffPerformance(){
		return "common/wait";
	}
	/**
	 * 产品销量
	 * @return
	 */
	@RequestMapping("mgr_performance_productperf.action")
	public String productPSaleNum(){
		return "common/wait";
	}


    /**
     * 默认查询一个月订单数，降序查询
     */
    @RequestMapping("/manager_findAllOrder.action")
    @ResponseBody
    public List<MyOrdersproduct> findAllOrderByQ(VoOrderRecorde voOrderRecorde){
        //获得现在的时间和上一个月的时间
        String crudate = DateUtils.getCrudate();
        String lastMonth = DateUtils.getLastMonth();
        List<MyOrdersproduct> list =  managerService.findAllOrderByQ(crudate,lastMonth,voOrderRecorde);
        return list;
    }
    /**
     * 查询所有订单详细数据
     */
    @RequestMapping("/manager_findAllOrderInfo.action")
    @ResponseBody
    public List<Orders> findAllOrderInfo(VoOrderRecorde voOrderRecorde){
        //获得现在的时间和上一个月的时间
        String crudate = DateUtils.getCrudate();
        String lastMonth = DateUtils.getLastMonth();
       List<Orders> list = managerService.findAllOrderInfo(crudate ,lastMonth ,voOrderRecorde);
       return list;
    }
    /**
     * 显示订单信息页面
     */
    @RequestMapping("/manager_showOrderInfo.action")
    public String showOrderInfo(){
        return "manager/orderinfo";
    }

    /**
     * 跳转库存转订单页面
     */

    @RequestMapping("/manager_stock2order.action")
    public String stock2orderJSP(String row, HttpServletRequest request ){
       /* //get提交，进行乱码处理
        try {
            row = new String(row.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        List<MyOrdersproduct> list = JSON.parseArray(row, MyOrdersproduct.class);
        if(list.size()>0) {
            //将获取的数据进行转换，并且存储到下一个页面
            request.getSession().setAttribute("myOrdersproduct",list.get(0));
        }
        return "manager/stock2order";
    }
    /**
     * 库存转订单
     */
    @RequestMapping("/manager_stockToOrder.action")
    @ResponseBody
    public Integer stockToOrder(String p ,String row,Integer changeNum){
        Stock stock = JSON.parseObject(row, Stock.class);
        Ordersproduct ordersproduct = JSON.parseObject(p, Ordersproduct.class);
        //创建一个Ordersproduct，用于对象更新
        //将需要需要转换的商品数量更改，实到数量=实到数量+转换数量,
        int sumSdnum = ordersproduct.getSdnum()+changeNum;
        ordersproduct.setSdnum(sumSdnum);

        int resrow = managerService.stockToOrder(ordersproduct,changeNum,stock);
        if(resrow  != 1){
            return 0;
        }
        return sumSdnum;
    }
    /**
     * 订单转库存
     */
    @RequestMapping("/manager_orderToStock.action")
    @ResponseBody
    public Integer orderToStock(String rows){
        List<Ordersproduct> list = JSON.parseArray(rows,Ordersproduct.class);
        int row =managerService.orderToStock(list);
        return row;

    }
    /**
     * 导出订单给厂商
     */
    @RequestMapping("/manager_exportOrderToFactory.action")
    public void exportOrderToFactory(String ids, HttpServletRequest request, HttpServletResponse response){


        int res = 0;
        //查询出选中的订单信息
        List<MyOrdersproduct> list = null;
        if(null != ids){
        	String[] split = ids.split(",");
        	list = managerService.getMyOrderProductByIds(split);
        }
//        List<MyOrdersproduct> list = JSON.parseArray(row, MyOrdersproduct.class);
        //创建Eexcel文件，
        //使用poi下载文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建工作簿
        HSSFSheet sheet = workbook.createSheet("商品订货信息");
        sheet.setColumnWidth(1, 22*256);
        sheet.setColumnWidth(2, 12*256);
        sheet.setColumnWidth(3, 12*256);
        sheet.setColumnWidth(5, 30*256);
        sheet.setColumnWidth(7, 60*256);
        //创建表头
        HSSFRow rows = sheet.createRow(0);//第一行
        //创建单元格头标，标题行数据
        rows.createCell(0).setCellValue("序号");
        rows.createCell(1).setCellValue("订单号");
        rows.createCell(2).setCellValue("客户");
        rows.createCell(3).setCellValue("业务员");
        rows.createCell(4).setCellValue("类别");
        rows.createCell(5).setCellValue("型号");
        rows.createCell(6).setCellValue("品牌");
        rows.createCell(7).setCellValue("配置");
        rows.createCell(8).setCellValue("数量");
        rows.createCell(9).setCellValue("日期");
        //获得当前时间
        SimpleDateFormat sFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar=Calendar.getInstance();
        String excelName=sFormat.format(calendar.getTime());
        String createExcelname = excelName + "商品订货表.xls";
        //获取数据，从第二行开始以此往excel表格里面赋值
        for (int i = 0; i < list.size() ; i++) {
            HSSFRow sheetRow = sheet.createRow(i + 1);
            //给数据赋值
            sheetRow.createCell(0).setCellValue(i+1);
            sheetRow.createCell(1).setCellValue(list.get(i).getOrdersid());
            sheetRow.createCell(2).setCellValue(list.get(i).getCustomername());
            sheetRow.createCell(3).setCellValue(list.get(i).getUsername());
            sheetRow.createCell(4).setCellValue(list.get(i).getProducttype());
            sheetRow.createCell(5).setCellValue(list.get(i).getTypenoname());
            sheetRow.createCell(6).setCellValue(list.get(i).getBrand());
            sheetRow.createCell(7).setCellValue(list.get(i).getConf());
            sheetRow.createCell(8).setCellValue(list.get(i).getNum());
            sheetRow.createCell(9).setCellValue(sFormat.format(list.get(i).getOrderdate()).toString());
        }

        //填写数据
        ServletOutputStream outputStream = null;
        String agent = request.getHeader("User-Agent");
        try {
            createExcelname = FileUtils.encodeDownloadFilename(createExcelname, agent);
            String contentType = request.getServletContext().getMimeType(createExcelname);
            response.setContentType(contentType);
            response.setHeader("content-disposition", "attachment;filename="+createExcelname);
            //获得流对象
            outputStream = response.getOutputStream();
            workbook.write(outputStream);
            //修改已经处理订单的状态
            res = managerService.updateOrderCLQK(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //向浏览器返回需要下载的信息。
        //返回页面
        request.setAttribute("status", res);
    }

    /**
     * 导出所有订单数据
     * @param ids
     * @return
     */
    @RequestMapping("/manager_exportAllOrder.action")
    public void exportAllOrder(String allOrderIds, HttpServletRequest request, HttpServletResponse response){
        //获得现在的时间和上一个月的时间
        String crudate = DateUtils.getCrudate();
        String lastMonth = DateUtils.getLastMonth();

        VoOrderRecorde voOrderRecorde  = new VoOrderRecorde();
//        List<MyOrdersproduct> list =  managerService.findAllOrderByQ(crudate,lastMonth,voOrderRecorde);
        List<MyOrdersproduct> list = JSON.parseArray(allOrderIds,MyOrdersproduct.class);

        //创建Eexcel文件，
        //使用poi下载文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建工作簿
        HSSFSheet sheet = workbook.createSheet("商品订货信息");
        sheet.setColumnWidth(1, 22*256);
        sheet.setColumnWidth(2, 22*256);
        sheet.setColumnWidth(3, 12*256);
        sheet.setColumnWidth(5, 12*256);
        sheet.setColumnWidth(6, 50*256);
        sheet.setColumnWidth(7, 60*256);
        //创建表头
        HSSFRow rows = sheet.createRow(0);//第一行
        //创建单元格头标，标题行数据
        rows.createCell(0).setCellValue("序号");
        rows.createCell(1).setCellValue("订单号");
        rows.createCell(2).setCellValue("日期");
        rows.createCell(3).setCellValue("客户");
        rows.createCell(4).setCellValue("业务员");
        rows.createCell(5).setCellValue("类别");
        rows.createCell(6).setCellValue("型号");
        rows.createCell(7).setCellValue("特殊备注");
        rows.createCell(8).setCellValue("数量");
        rows.createCell(9).setCellValue("品牌");
        rows.createCell(10).setCellValue("实到数");
        rows.createCell(11).setCellValue("已发量");
        rows.createCell(12).setCellValue("单价");
        rows.createCell(13).setCellValue("总价");
        rows.createCell(14).setCellValue("定金");
        rows.createCell(15).setCellValue("完成状态");
        rows.createCell(16).setCellValue("库存");
        rows.createCell(17).setCellValue("发货方式");
        rows.createCell(18).setCellValue("处理情况");

        //获得当前时间
        SimpleDateFormat sFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar=Calendar.getInstance();
        String excelName=sFormat.format(calendar.getTime());
        String createExcelname = excelName + "订单表.xls";
        //获取数据，从第二行开始以此往excel表格里面赋值
        for (int i = 0; i < list.size() ; i++) {
            HSSFRow sheetRow = sheet.createRow(i + 1);
            //给数据赋值
            sheetRow.createCell(0).setCellValue(i+1);
            String ordersId = list.get(i).getOrdersid();
            sheetRow.createCell(1).setCellValue(ordersId);

            String orderdate = sFormat.format(list.get(i).getOrderdate()).toString();
            sheetRow.createCell(2).setCellValue(orderdate);

            String customername = list.get(i).getCustomername();
            sheetRow.createCell(3).setCellValue(customername);
            String username = list.get(i).getUsername();
            sheetRow.createCell(4).setCellValue(username);
            String productType = list.get(i).getProducttype();
            sheetRow.createCell(5).setCellValue(productType);
            String typeno = list.get(i).getTypenoname();
            sheetRow.createCell(6).setCellValue(typeno);
            String conf = list.get(i).getConf();
            sheetRow.createCell(7).setCellValue(conf);
            String num = list.get(i).getNum().toString();
            sheetRow.createCell(8).setCellValue(num);
            String brand = list.get(i).getBrand();
            sheetRow.createCell(9).setCellValue(brand);
            String sdnum = list.get(i).getSdnum().toString();
            sheetRow.createCell(10).setCellValue(sdnum);
            String sendnum = list.get(i).getSendnum().toString();
            sheetRow.createCell(11).setCellValue(sendnum);

            String price = list.get(i).getPrice().toString();
            sheetRow.createCell(12).setCellValue(price);
            String totalPrice = list.get(i).getLessprice().toString();
            sheetRow.createCell(13).setCellValue(totalPrice);
            String dingjin = list.get(i).getDingjin();
            sheetRow.createCell(14).setCellValue(dingjin);

            String wczt = list.get(i).getWczt();
            String wcztName ="未完成";
            switch (wczt){
                case "0" :
                    wcztName = "未入库";
                    break;
                case  "1" :
                    wcztName = "入库未私印";
                    break;
                case "2" :
                    wcztName = "入库完成";
                    break;
                case  "3" :
                    wcztName = "已打单";
                    break;
                case "4" :
                    wcztName = "已发货";
                    break;
            }
            sheetRow.createCell(15).setCellValue(wcztName);
            String kucun  = list.get(i).getKunum().toString();
            sheetRow.createCell(16).setCellValue(kucun);
            String fhfs = list.get(i).getSkqk();
            sheetRow.createCell(17).setCellValue(fhfs);
            String clqk = list.get(i).getClqk();
            String clqkName = "";
            if(clqk.equals("0")){
                clqkName = "未处理";
            }else{
                clqkName = "已处理";
            }
            sheetRow.createCell(18).setCellValue(clqkName);
        }

        //填写数据
        ServletOutputStream outputStream = null;
        String agent = request.getHeader("User-Agent");
        try {
            createExcelname = FileUtils.encodeDownloadFilename(createExcelname, agent);
            String contentType = request.getServletContext().getMimeType(createExcelname);
            response.setContentType(contentType);
            response.setHeader("content-disposition", "attachment;filename="+createExcelname);
            //获得流对象
            outputStream = response.getOutputStream();
            workbook.write(outputStream);
            //修改已经处理订单的状态
//            res = managerService.updateOrderCLQK(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //向浏览器返回需要下载的信息。
        //返回页面
//        request.setAttribute("status", res);



//        System.out.println(ids.length);

    }




    @RequestMapping("/admin_deleteOrderProduct.action")
    public String deleteOrderProduct(String ids){
        if(ids != null){
            String[] split = ids.split(",");
            managerService.deleteOrderProduct(split);
        }
        return "manager/showorder";
    }
    @RequestMapping("/admin_deleteOrder.action")
    @ResponseBody
    public Integer deleteOrder(String ids){
        int row = 0;
        if(null != ids){
            String[] split = ids.split(",");
            row = managerService.deleteOrder(split);
        }
        return row;
    }



}
