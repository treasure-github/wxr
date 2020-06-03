package com.itheima.bos.web.pojo;

import java.math.BigDecimal;

public class Ordersproduct {
    private String id;

    private String ordersid;

    private String producttype;

    private String conf;

    private Integer sdnum;

    private Integer num;

    private Integer sendnum;

    private BigDecimal price;

    private BigDecimal lessprice;

    private String wczt;

    private String isdelete;

    private String fahuoqk;

    private String skqk;

    private String clqk;

    private String typenoname;

    private String brand;

    private String remark;

    private String stockaddress;
    private String customername;
    private String username;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid == null ? null : ordersid.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf == null ? null : conf.trim();
    }

    public Integer getSdnum() {
        return sdnum;
    }

    public void setSdnum(Integer sdnum) {
        this.sdnum = sdnum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSendnum() {
        return sendnum;
    }

    public void setSendnum(Integer sendnum) {
        this.sendnum = sendnum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getLessprice() {
        return lessprice;
    }

    public void setLessprice(BigDecimal lessprice) {
        this.lessprice = lessprice;
    }

    public String getWczt() {
        return wczt;
    }

    public void setWczt(String wczt) {
        this.wczt = wczt == null ? null : wczt.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    public String getFahuoqk() {
        return fahuoqk;
    }

    public void setFahuoqk(String fahuoqk) {
        this.fahuoqk = fahuoqk == null ? null : fahuoqk.trim();
    }

    public String getSkqk() {
        return skqk;
    }

    public void setSkqk(String skqk) {
        this.skqk = skqk == null ? null : skqk.trim();
    }

    public String getClqk() {
        return clqk;
    }

    public void setClqk(String clqk) {
        this.clqk = clqk == null ? null : clqk.trim();
    }

    public String getTypenoname() {
        return typenoname;
    }

    public void setTypenoname(String typenoname) {
        this.typenoname = typenoname == null ? null : typenoname.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStockaddress() {
        return stockaddress;
    }

    public void setStockaddress(String stockaddress) {
        this.stockaddress = stockaddress == null ? null : stockaddress.trim();
    }
}