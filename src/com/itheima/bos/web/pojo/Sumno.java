package com.itheima.bos.web.pojo;

public class Sumno {
    private String printorderno;

    private String orderno;

    public String getPrintorderno() {
        return printorderno;
    }

    public void setPrintorderno(String printorderno) {
        this.printorderno = printorderno == null ? null : printorderno.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }
}