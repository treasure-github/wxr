package com.itheima.bos.web.pojo;

import java.util.Date;

public class Outputrecord {
    private String id;

    private String ddrecordid;

    private String productorderid;

    private Integer outputnum;

    private Date outputdate;

    private String wlno;

    private String skfs;

    private String printorderno;

    public String getDdrecordid() {
        return ddrecordid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDdrecordid(String ddrecordid) {
        this.ddrecordid = ddrecordid == null ? null : ddrecordid.trim();
    }

    public String getProductorderid() {
        return productorderid;
    }

    public void setProductorderid(String productorderid) {
        this.productorderid = productorderid == null ? null : productorderid.trim();
    }

    public Integer getOutputnum() {
        return outputnum;
    }

    public void setOutputnum(Integer outputnum) {
        this.outputnum = outputnum;
    }

    public Date getOutputdate() {
        return outputdate;
    }

    public void setOutputdate(Date outputdate) {
        this.outputdate = outputdate;
    }

    public String getWlno() {
        return wlno;
    }

    public void setWlno(String wlno) {
        this.wlno = wlno == null ? null : wlno.trim();
    }

    public String getSkfs() {
        return skfs;
    }

    public void setSkfs(String skfs) {
        this.skfs = skfs == null ? null : skfs.trim();
    }

    public String getPrintorderno() {
        return printorderno;
    }

    public Outputrecord() {
    }

    public Outputrecord(String id, String ddrecordid, String productorderid, Integer outputnum, Date outputdate, String wlno, String skfs, String printorderno) {
        this.id = id;
        this.ddrecordid = ddrecordid;
        this.productorderid = productorderid;
        this.outputnum = outputnum;
        this.outputdate = outputdate;
        this.wlno = wlno;
        this.skfs = skfs;
        this.printorderno = printorderno;
    }

    public void setPrintorderno(String printorderno) {
        this.printorderno = printorderno == null ? null : printorderno.trim();
    }
}