package com.itheima.bos.web.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.math.BigDecimal;
import java.util.Date;

public class DsTborder {
    private String id;


    private String orderid;


    private String customervipname;

    private BigDecimal paymoney;

    private String customermark;
    private String receiver;
    private String receiveraddr;
    private String lxphone;
    private Date orderpaytime;
    private String ordermark;
    private Integer bbnum;
    private String productattr;
    private String sendexpress;

    private BigDecimal cost;

    private BigDecimal expresscost;

    private BigDecimal zacost;

    private BigDecimal installcost;

    private BigDecimal fixcost;

    private String totalorderid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getExpresscost() {
        return expresscost;
    }

    public void setExpresscost(BigDecimal expresscost) {
        this.expresscost = expresscost;
    }

    public BigDecimal getZacost() {
        return zacost;
    }

    public void setZacost(BigDecimal zacost) {
        this.zacost = zacost;
    }

    public BigDecimal getInstallcost() {
        return installcost;
    }

    public void setInstallcost(BigDecimal installcost) {
        this.installcost = installcost;
    }

    public BigDecimal getFixcost() {
        return fixcost;
    }

    public void setFixcost(BigDecimal fixcost) {
        this.fixcost = fixcost;
    }

    public String getTotalorderid() {
        return totalorderid;
    }

    public void setTotalorderid(String totalorderid) {
        this.totalorderid = totalorderid == null ? null : totalorderid.trim();
    }

    @Override
    public String toString() {
        return "DsTborder{" +
                "id='" + id + '\'' +
                ", orderid='" + orderid + '\'' +
                ", customervipname='" + customervipname + '\'' +
                ", paymoney=" + paymoney +
                ", customermark='" + customermark + '\'' +
                ", receiver='" + receiver + '\'' +
                ", receiveraddr='" + receiveraddr + '\'' +
                ", lxphone='" + lxphone + '\'' +
                ", orderpaytime=" + orderpaytime +
                ", ordermark='" + ordermark + '\'' +
                ", bbnum=" + bbnum +
                ", productattr='" + productattr + '\'' +
                ", sendexpress='" + sendexpress + '\'' +
                ", cost=" + cost +
                ", expresscost=" + expresscost +
                ", zacost=" + zacost +
                ", installcost=" + installcost +
                ", fixcost=" + fixcost +
                ", totalorderid='" + totalorderid + '\'' +
                '}';
    }
}