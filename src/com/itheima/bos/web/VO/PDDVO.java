package com.itheima.bos.web.VO;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import java.util.Date;

public class PDDVO extends BaseRowModel {

    @ExcelProperty(value = "订单号" ,index = 1)
    private String orderid;
    @ExcelProperty(value = "商品总价(元)",index = 3)
    private String productsumprice;
    @ExcelProperty(value = "店铺优惠折扣(元)",index = 4)
    private String storediscount;
    @ExcelProperty(value = "平台优惠折扣(元)",index = 5)
    private String platformdiscount;
    @ExcelProperty(value = "商家实收金额(元)",index = 10)
    private String storeincome;
    @ExcelProperty(value = "商品数量(件)",index = 11)
    private String productnum;
    @ExcelProperty(value = "收货人",index =14 )
    private String receivername;
    @ExcelProperty(value = "手机",index = 15)
    private String phone;
    @ExcelProperty(value = "省",index = 17)
    private String province;
    private Date pdsuccesstime;
    @ExcelProperty(value = "订单确认时间",index = 22 ,format = "yyyy-MM-dd")
    private Date sureordertime;
    @ExcelProperty(value = "商品规格",index = 27)
    private String custmoerphone;
    @ExcelProperty(value = "快递",index = 47)
    private String expressname;
    @ExcelProperty(index = 48)
    private String zacost;

    public String getZacost() {
        return zacost;
    }

    public void setZacost(String zacost) {
        this.zacost = zacost;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getProductsumprice() {
        return productsumprice;
    }

    public void setProductsumprice(String productsumprice) {
        this.productsumprice = productsumprice;
    }

    public String getStorediscount() {
        return storediscount;
    }

    public void setStorediscount(String storediscount) {
        this.storediscount = storediscount;
    }

    public String getPlatformdiscount() {
        return platformdiscount;
    }

    public void setPlatformdiscount(String platformdiscount) {
        this.platformdiscount = platformdiscount;
    }

    public String getStoreincome() {
        return storeincome;
    }

    public void setStoreincome(String storeincome) {
        this.storeincome = storeincome;
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum;
    }


    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getPdsuccesstime() {
        return pdsuccesstime;
    }

    public void setPdsuccesstime(Date pdsuccesstime) {
        this.pdsuccesstime = pdsuccesstime;
    }

    public Date getSureordertime() {
        return sureordertime;
    }

    public void setSureordertime(Date sureordertime) {
        this.sureordertime = sureordertime;
    }

    public String getCustmoerphone() {
        return custmoerphone;
    }

    public void setCustmoerphone(String custmoerphone) {
        this.custmoerphone = custmoerphone;
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname;
    }







}
