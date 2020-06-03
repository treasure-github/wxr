package com.itheima.bos.web.pojo;

import java.util.Date;

public class Stock2orderrecord {
    private String id;

    private String ordersid;

    private String customername;

    private String username;

    private String oldtypename;

    private String oldtypenoname;

    private String olrbrand;

    private Integer changnum;

    private String wcqk;

    private String newconf;

    private String newtypename;

    private String newtypenoname;

    private String newbrand;

    private String stockaddress;

    private Date changetime;

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

    public String getOldtypename() {
        return oldtypename;
    }

    public void setOldtypename(String oldtypename) {
        this.oldtypename = oldtypename == null ? null : oldtypename.trim();
    }

    public String getOldtypenoname() {
        return oldtypenoname;
    }

    public void setOldtypenoname(String oldtypenoname) {
        this.oldtypenoname = oldtypenoname == null ? null : oldtypenoname.trim();
    }

    public String getOlrbrand() {
        return olrbrand;
    }

    public void setOlrbrand(String olrbrand) {
        this.olrbrand = olrbrand == null ? null : olrbrand.trim();
    }

    public Integer getChangnum() {
        return changnum;
    }

    public void setChangnum(Integer changnum) {
        this.changnum = changnum;
    }

    public String getWcqk() {
        return wcqk;
    }

    public void setWcqk(String wcqk) {
        this.wcqk = wcqk == null ? null : wcqk.trim();
    }

    public String getNewconf() {
        return newconf;
    }

    public void setNewconf(String newconf) {
        this.newconf = newconf == null ? null : newconf.trim();
    }

    public String getNewtypename() {
        return newtypename;
    }

    public void setNewtypename(String newtypename) {
        this.newtypename = newtypename == null ? null : newtypename.trim();
    }

    public String getNewtypenoname() {
        return newtypenoname;
    }

    public void setNewtypenoname(String newtypenoname) {
        this.newtypenoname = newtypenoname == null ? null : newtypenoname.trim();
    }

    public String getNewbrand() {
        return newbrand;
    }

    public void setNewbrand(String newbrand) {
        this.newbrand = newbrand == null ? null : newbrand.trim();
    }

    public String getStockaddress() {
        return stockaddress;
    }

    public void setStockaddress(String stockaddress) {
        this.stockaddress = stockaddress == null ? null : stockaddress.trim();
    }

    public Date getChangetime() {
        return changetime;
    }

    public void setChangetime(Date changetime) {
        this.changetime = changetime;
    }
}