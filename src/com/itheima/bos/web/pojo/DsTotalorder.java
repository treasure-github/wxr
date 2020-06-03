package com.itheima.bos.web.pojo;

import java.util.Date;

public class DsTotalorder {
    private String totalorderid;

    private String tborderid;

    private String istrue;

    private String platformtype;

    private Date sendtime;

    public String getTotalorderid() {
        return totalorderid;
    }

    public void setTotalorderid(String totalorderid) {
        this.totalorderid = totalorderid == null ? null : totalorderid.trim();
    }

    public String getTborderid() {
        return tborderid;
    }

    public void setTborderid(String tborderid) {
        this.tborderid = tborderid == null ? null : tborderid.trim();
    }

    public String getIstrue() {
        return istrue;
    }

    public void setIstrue(String istrue) {
        this.istrue = istrue == null ? null : istrue.trim();
    }

    public String getPlatformtype() {
        return platformtype;
    }

    public void setPlatformtype(String platformtype) {
        this.platformtype = platformtype == null ? null : platformtype.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}