package com.itheima.bos.web.pojo;

import java.util.Date;

public class Orderinputrecord {
    private String id;

    private String ordersid;

    private String customername;

    private String username;

    private String typename;

    private String typenoname;

    private String brand;

    private String conf;

    private Integer num;

    private String stockaddress;

    private Date rksj;

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

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
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

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf == null ? null : conf.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStockaddress() {
        return stockaddress;
    }

    public void setStockaddress(String stockaddress) {
        this.stockaddress = stockaddress == null ? null : stockaddress.trim();
    }

    public Date getRksj() {
        return rksj;
    }

    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }
}