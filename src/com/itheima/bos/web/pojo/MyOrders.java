package com.itheima.bos.web.pojo;

import java.util.Date;

public class MyOrders {

    private String id;

    private String customername;

    private String username;

    private String wczt;

    private Date orderdate;

    private Double dingjin;

    private String fhfs;

    private Double collectionmoney;


    public Double
    getSumtotal() {
        return sumtotal;
    }

    public void setSumtotal(Double sumtotal) {
        this.sumtotal = sumtotal;
    }

    private Double sumtotal;

    public Double getDingjin() {
        return dingjin;
    }

    public void setDingjin(Double dingjin) {
        this.dingjin = dingjin;
    }

    public Double getSumprice() {
        return sumprice;
    }

    public void setSumprice(Double sumprice) {
        this.sumprice = sumprice;
    }

    private Double sumprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getWczt() {
        return wczt;
    }

    public void setWczt(String wczt) {
        this.wczt = wczt;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }


    public String getFhfs() {
        return fhfs;
    }

    public void setFhfs(String fhfs) {
        this.fhfs = fhfs;
    }

    public Double getCollectionmoney() {
        return collectionmoney;
    }

    public void setCollectionmoney(Double collectionmoney) {
        this.collectionmoney = collectionmoney;
    }
}
