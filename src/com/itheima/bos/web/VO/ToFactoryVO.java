package com.itheima.bos.web.VO;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class ToFactoryVO extends BaseRowModel{
    @ExcelProperty(value = "序号" ,index = 0)
    private int serialNum;
    @ExcelProperty(value = "订单号",index = 1)
    private String orderid;

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getTypeno() {
        return typeno;
    }

    public void setTypeno(String typeno) {
        this.typeno = typeno;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    @ExcelProperty(value = "客户",index = 2)

    private String customername;
    @ExcelProperty(value = "业务员",index = 3)
    private String username;
    @ExcelProperty(value = "类别",index = 4)
    private String producttype;
    @ExcelProperty(value = "型号",index = 5)
    private String typeno;
    @ExcelProperty(value = "品牌",index = 6)
    private String brand;
    @ExcelProperty(value = "配置",index = 7)
    private String conf;
    @ExcelProperty(value = "数量",index = 8)
    private String num;
    @ExcelProperty(value = "日期",index = 9)
    private String orderdate;

}
