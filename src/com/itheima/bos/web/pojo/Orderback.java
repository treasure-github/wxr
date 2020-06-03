package com.itheima.bos.web.pojo;

import java.util.Date;

/**
 * @Description java类作用描述
 * @Author hws
 * @CreateDate 2020/5/27 12:35
 */
public class Orderback {
    private String orderid;
    private String storename;
    private String customerinfo;
    private String oldno;
    private String backno;
    private String registname;
    private Date registtime;
    private String registmark;
    private String handlename;
    private String handlereason;
    private Date handletime;
    private String basename;
    private String signstatu;
    private String signmark;
    private Date signtime;
    private String product;

    public Orderback() {
    }

    public String getOrderid() {
        return this.orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getStorename() {
        return this.storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getCustomerinfo() {
        return this.customerinfo;
    }

    public void setCustomerinfo(String customerinfo) {
        this.customerinfo = customerinfo == null ? null : customerinfo.trim();
    }

    public String getOldno() {
        return this.oldno;
    }

    public void setOldno(String oldno) {
        this.oldno = oldno == null ? null : oldno.trim();
    }

    public String getBackno() {
        return this.backno;
    }

    public void setBackno(String backno) {
        this.backno = backno == null ? null : backno.trim();
    }

    public String getRegistname() {
        return this.registname;
    }

    public void setRegistname(String registname) {
        this.registname = registname == null ? null : registname.trim();
    }

    public Date getRegisttime() {
        return this.registtime;
    }

    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    public String getRegistmark() {
        return this.registmark;
    }

    public void setRegistmark(String registmark) {
        this.registmark = registmark == null ? null : registmark.trim();
    }

    public String getHandlename() {
        return this.handlename;
    }

    public void setHandlename(String handlename) {
        this.handlename = handlename == null ? null : handlename.trim();
    }

    public String getHandlereason() {
        return this.handlereason;
    }

    public void setHandlereason(String handlereason) {
        this.handlereason = handlereason == null ? null : handlereason.trim();
    }

    public Date getHandletime() {
        return this.handletime;
    }

    public void setHandletime(Date handletime) {
        this.handletime = handletime;
    }

    public String getBasename() {
        return this.basename;
    }

    public void setBasename(String basename) {
        this.basename = basename == null ? null : basename.trim();
    }

    public String getSignstatu() {
        return this.signstatu;
    }

    public void setSignstatu(String signstatu) {
        this.signstatu = signstatu == null ? null : signstatu.trim();
    }

    public String getSignmark() {
        return this.signmark;
    }

    public void setSignmark(String signmark) {
        this.signmark = signmark == null ? null : signmark.trim();
    }

    public Date getSigntime() {
        return this.signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }
}
