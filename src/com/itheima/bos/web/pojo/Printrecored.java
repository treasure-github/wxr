package com.itheima.bos.web.pojo;

import java.util.Date;

public class Printrecored {
    private String printorderno;

    private String isdelete;

    private Date printdate;

    private String username;

    public String getPrintorderno() {
        return printorderno;
    }

    public void setPrintorderno(String printorderno) {
        this.printorderno = printorderno == null ? null : printorderno.trim();
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    public Date getPrintdate() {
        return printdate;
    }

    public void setPrintdate(Date printdate) {
        this.printdate = printdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}