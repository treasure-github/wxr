package com.itheima.bos.web.VO;

/**
 * @Description java类作用描述
 * @Author hws
 * @CreateDate 2020/5/27 12:34
 */
public class VoOrderBack {
    private String ordersid;
    private String storename;
    private String customerinfo;
    private String oldno;
    private String backno;
    private String registname;
    private String registtime;
    private String handlename;
    private String beginTime;
    private String endTime;
    private String q;

    public VoOrderBack() {
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOrdersid() {
        return this.ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid;
    }

    public String getStorename() {
        return this.storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getCustomerinfo() {
        return this.customerinfo;
    }

    public void setCustomerinfo(String customerinfo) {
        this.customerinfo = customerinfo;
    }

    public String getOldno() {
        return this.oldno;
    }

    public void setOldno(String oldno) {
        this.oldno = oldno;
    }

    public String getBackno() {
        return this.backno;
    }

    public void setBackno(String backno) {
        this.backno = backno;
    }

    public String getRegistname() {
        return this.registname;
    }

    public void setRegistname(String registname) {
        this.registname = registname;
    }

    public String getRegisttime() {
        return this.registtime;
    }

    public void setRegisttime(String registtime) {
        this.registtime = registtime;
    }

    public String getHandlename() {
        return this.handlename;
    }

    public void setHandlename(String handlename) {
        this.handlename = handlename;
    }

    public String getQ() {
        return this.q;
    }

    public void setQ(String q) {
        this.q = q;
    }
}
