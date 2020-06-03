package com.itheima.bos.web.VO;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.math.BigDecimal;
import java.util.Date;

public class TaoBaoVO extends BaseRowModel{

    @ExcelProperty(index = 0)
    private String orderid;
    @ExcelProperty(index = 1)
    private String customervipname;
    @ExcelProperty(index = 2)
    private BigDecimal paymoney;
    @ExcelProperty(index = 3)
    private String customermark;
    @ExcelProperty(index = 4)
    private String receiver;
    @ExcelProperty(index = 5)
    private String receiveraddr;
    @ExcelProperty(index = 6)
    private String lxphone;
    @ExcelProperty(index = 7,format = "yyyy-MM-dd")
    private Date orderpaytime;
    @ExcelProperty(index = 8)
    private String ordermark;
    @ExcelProperty(index = 9)
    private Integer bbnum;
    @ExcelProperty(index = 10)
    private String productattr;
    @ExcelProperty(index = 11)
    private String sendexpress;
    @ExcelProperty(index = 12)
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
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getCustomervipname() {
        return customervipname;
    }

    public void setCustomervipname(String customervipname) {
        this.customervipname = customervipname == null ? null : customervipname.trim();
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public String getCustomermark() {
        return customermark;
    }

    public void setCustomermark(String customermark) {
        this.customermark = customermark == null ? null : customermark.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getReceiveraddr() {
        return receiveraddr;
    }

    public void setReceiveraddr(String receiveraddr) {
        this.receiveraddr = receiveraddr == null ? null : receiveraddr.trim();
    }

    public String getLxphone() {
        return lxphone;
    }

    public void setLxphone(String lxphone) {
        this.lxphone = lxphone == null ? null : lxphone.trim();
    }

    public Date getOrderpaytime() {
        return orderpaytime;
    }

    public void setOrderpaytime(Date orderpaytime) {
        this.orderpaytime = orderpaytime;
    }

    public String getOrdermark() {
        return ordermark;
    }

    public void setOrdermark(String ordermark) {
        this.ordermark = ordermark == null ? null : ordermark.trim();
    }

    public Integer getBbnum() {
        return bbnum;
    }

    public void setBbnum(Integer bbnum) {
        this.bbnum = bbnum;
    }

    public String getProductattr() {
        return productattr;
    }

    public void setProductattr(String productattr) {
        this.productattr = productattr == null ? null : productattr.trim();
    }

    public String getSendexpress() {
        return sendexpress;
    }

    public void setSendexpress(String sendexpress) {
        this.sendexpress = sendexpress == null ? null : sendexpress.trim();
    }

}
