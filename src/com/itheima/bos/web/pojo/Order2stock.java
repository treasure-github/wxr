package com.itheima.bos.web.pojo;

import java.util.Date;

public class Order2stock {
    private String id;

    private String orderproductid;

    private Integer num;

    private String username;

    private String wczt;

    private Date changdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderproductid() {
        return orderproductid;
    }

    public void setOrderproductid(String orderproductid) {
        this.orderproductid = orderproductid == null ? null : orderproductid.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getWczt() {
        return wczt;
    }

    public void setWczt(String wczt) {
        this.wczt = wczt == null ? null : wczt.trim();
    }

    public Date getChangdate() {
        return changdate;
    }

    public void setChangdate(Date changdate) {
        this.changdate = changdate;
    }
}