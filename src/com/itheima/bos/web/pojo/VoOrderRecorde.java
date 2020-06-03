package com.itheima.bos.web.pojo;

public class VoOrderRecorde {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String begintime ;
    private String endtime ;
    private String customername ;
    private String wczt ;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getWczt() {
        return wczt;
    }

    public void setWczt(String wczt) {
        this.wczt = wczt;
    }

    @Override
    public String toString() {
        return "VoOrderRecorde{" +
                "id='" + id + '\'' +
                ", begintime='" + begintime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", customername='" + customername + '\'' +
                ", wczt='" + wczt + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
