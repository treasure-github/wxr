package com.itheima.bos.web.VO;


public class ProfitVo {
    private Double cost;

    private Double expresscost;

    private Double zacost;

    private Double installcost;

    private Double fixcost;

    private Integer bbnum;
    private Double storeincome;
    private Integer productnum;

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    public Double getStoreincome() {
        return storeincome;
    }

    public void setStoreincome(Double storeincome) {
        this.storeincome = storeincome;
    }

    public Integer getBbnum() {
        return bbnum;
    }

    public void setBbnum(Integer bbnum) {
        this.bbnum = bbnum;
    }


    public Double getFixcost() {
        return fixcost;
    }

    public void setFixcost(Double fixcost) {
        this.fixcost = fixcost;
    }

    private Double paymoney;

    public ProfitVo() {
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getExpresscost() {
        return expresscost;
    }

    public void setExpresscost(Double expresscost) {
        this.expresscost = expresscost;
    }

    public Double getZacost() {
        return zacost;
    }

    public void setZacost(Double zacost) {
        this.zacost = zacost;
    }

    public Double getInstallcost() {
        return installcost;
    }

    public void setInstallcost(Double installcost) {
        this.installcost = installcost;
    }


    public Double getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(Double paymoney) {
        this.paymoney = paymoney;
    }
}
