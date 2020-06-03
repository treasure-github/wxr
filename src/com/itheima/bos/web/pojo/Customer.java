package com.itheima.bos.web.pojo;

import java.util.Date;

public class Customer {
    private String id;

    private String customername;

    private String customerphone;
    private String gender;

    private String wuliuname;

    private String wuliuphone;

    private String wuliuaddress;

    private String customeraddress;

    private Date lastordertime;

    private String staffid;

    private String username;
    private String lasttime;

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public Date getLastordertime() {
        return lastordertime;
    }

    public void setLastordertime(Date lastordertime) {
        this.lastordertime = lastordertime;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", customername='" + customername + '\'' +
                ", customerphone='" + customerphone + '\'' +
                ", gender='" + gender + '\'' +
                ", wuliuname='" + wuliuname + '\'' +
                ", wuliuphone='" + wuliuphone + '\'' +
                ", wuliuaddress='" + wuliuaddress + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", lastordertime=" + lastordertime +
                ", staffid='" + staffid + '\'' +
                ", username='" + username + '\'' +
                ", lasttime='" + lasttime + '\'' +
                '}';
    }
}