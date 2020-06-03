package com.itheima.bos.web.pojo;

import java.util.Date;

public class Operationrecord {
    private String id;

    private String messager;

    private String username;

    private String oprationtype;

    private String menutype;

    private Date oprationtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessager() {
        return messager;
    }

    public void setMessager(String messager) {
        this.messager = messager == null ? null : messager.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOprationtype() {
        return oprationtype;
    }

    public void setOprationtype(String oprationtype) {
        this.oprationtype = oprationtype == null ? null : oprationtype.trim();
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype == null ? null : menutype.trim();
    }

    public Date getOprationtime() {
        return oprationtime;
    }

    public void setOprationtime(Date oprationtime) {
        this.oprationtime = oprationtime;
    }
}