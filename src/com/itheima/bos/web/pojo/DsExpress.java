package com.itheima.bos.web.pojo;

import java.math.BigDecimal;

public class DsExpress {
    private String expressid;

    private String province;

    private String expressname;

    private BigDecimal expresscost;

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getExpressname() {
        return expressname;
    }

    public void setExpressname(String expressname) {
        this.expressname = expressname == null ? null : expressname.trim();
    }

    public BigDecimal getExpresscost() {
        return expresscost;
    }

    public void setExpresscost(BigDecimal expresscost) {
        this.expresscost = expresscost;
    }
}