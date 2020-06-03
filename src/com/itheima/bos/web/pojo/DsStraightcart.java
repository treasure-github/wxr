package com.itheima.bos.web.pojo;

import java.util.Date;

public class DsStraightcart {
    private String storeid;

    private Double num;

    private Date straightdate;

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public Date getStraightdate() {
        return straightdate;
    }

    public void setStraightdate(Date straightdate) {
        this.straightdate = straightdate;
    }
}