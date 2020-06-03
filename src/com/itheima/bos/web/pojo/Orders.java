package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private String id;

    private String staffno;

    private String fhfs;

    private String customername;

    private String customerphone;

    private String customeraddress;

    private String wuliuname;

    private String wuliuphone;

    private String wuliuaddress;

    private Date orderdate;

    private String wczt;

    private String bz;

    private BigDecimal dingjin;

    private BigDecimal sumprice;

    private BigDecimal collectionmoney;

    private String collectionway;

    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStaffno() {
        return staffno;
    }

    public void setStaffno(String staffno) {
        this.staffno = staffno == null ? null : staffno.trim();
    }

    public String getFhfs() {
        return fhfs;
    }

    public void setFhfs(String fhfs) {
        this.fhfs = fhfs == null ? null : fhfs.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public String getWuliuname() {
        return wuliuname;
    }

    public void setWuliuname(String wuliuname) {
        this.wuliuname = wuliuname == null ? null : wuliuname.trim();
    }

    public String getWuliuphone() {
        return wuliuphone;
    }

    public void setWuliuphone(String wuliuphone) {
        this.wuliuphone = wuliuphone == null ? null : wuliuphone.trim();
    }

    public String getWuliuaddress() {
        return wuliuaddress;
    }

    public void setWuliuaddress(String wuliuaddress) {
        this.wuliuaddress = wuliuaddress == null ? null : wuliuaddress.trim();
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getWczt() {
        return wczt;
    }

    public void setWczt(String wczt) {
        this.wczt = wczt == null ? null : wczt.trim();
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public BigDecimal getDingjin() {
        return dingjin;
    }

    public void setDingjin(BigDecimal dingjin) {
        this.dingjin = dingjin;
    }

    public BigDecimal getSumprice() {
        return sumprice;
    }

    public void setSumprice(BigDecimal sumprice) {
        this.sumprice = sumprice;
    }

    public BigDecimal getCollectionmoney() {
        return collectionmoney;
    }

    public void setCollectionmoney(BigDecimal collectionmoney) {
        this.collectionmoney = collectionmoney;
    }

    public String getCollectionway() {
        return collectionway;
    }

    public void setCollectionway(String collectionway) {
        this.collectionway = collectionway == null ? null : collectionway.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}