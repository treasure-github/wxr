package com.itheima.bos.web.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MyOrdersproduct  implements Serializable{

    private String id;

    private String ordersid;

    private String producttype;

    private String conf;

    private Integer sdnum;

    private Integer num;

    private Integer sendnum;

    private BigDecimal price;

    private BigDecimal lessprice;

    private String wczt;

    private String laihuoqk;

    private String fahuoqk;

    private String skqk;

    private String clqk;

    private String typenoname;

    private String brand;

    private String remark;

    private String stockaddress;
    private String customername;

    private String username;

    private String oir_date;

    private String wlno;

    private String skfs;

    private String wuliuname;

    private String outputnum;

    private String ddrecordid;

    private String dingjin;

    private String collectionway;

    private String collectionmoney;

    private Double sumprice;

    public String getDdrecordid() {
        return ddrecordid;
    }

    public void setDdrecordid(String ddrecordid) {
        this.ddrecordid = ddrecordid;
    }

    public String getOutputnum() {
        return outputnum;
    }

    public void setOutputnum(String outputnum) {
        this.outputnum = outputnum;
    }

    public String getWlno() {
        return wlno;
    }

    public void setWlno(String wlno) {
        this.wlno = wlno;
    }

    public String getSkfs() {
        return skfs;
    }

    public void setSkfs(String skfs) {
        this.skfs = skfs;
    }

    public String getWuliuname() {
        return wuliuname;
    }

    public void setWuliuname(String wuliuname) {
        this.wuliuname = wuliuname;
    }

    public Date getOutputdate() {
        return outputdate;
    }

    public void setOutputdate(Date outputdate) {
        this.outputdate = outputdate;
    }

    private Date outputdate;

    public String getOir_date() {
        return oir_date;
    }

    public void setOir_date(String oir_date) {
        this.oir_date = oir_date;
    }

    private Integer kunum;

    public Integer getKunum() {
        return kunum;
    }

    public void setKunum(Integer kunum) {
        this.kunum = kunum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getConf() {
        return conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public Integer getSdnum() {
        return sdnum;
    }

    public void setSdnum(Integer sdnum) {
        this.sdnum = sdnum;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getSendnum() {
        return sendnum;
    }

    public void setSendnum(Integer sendnum) {
        this.sendnum = sendnum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getLessprice() {
        return lessprice;
    }

    public void setLessprice(BigDecimal lessprice) {
        this.lessprice = lessprice;
    }

    public String getWczt() {
        return wczt;
    }

    public void setWczt(String wczt) {
        this.wczt = wczt;
    }

    public String getLaihuoqk() {
        return laihuoqk;
    }

    public void setLaihuoqk(String laihuoqk) {
        this.laihuoqk = laihuoqk;
    }

    public String getFahuoqk() {
        return fahuoqk;
    }

    public void setFahuoqk(String fahuoqk) {
        this.fahuoqk = fahuoqk;
    }

    public String getSkqk() {
        return skqk;
    }

    public void setSkqk(String skqk) {
        this.skqk = skqk;
    }

    public String getClqk() {
        return clqk;
    }

    public void setClqk(String clqk) {
        this.clqk = clqk;
    }

    public String getTypenoname() {
        return typenoname;
    }

    public void setTypenoname(String typenoname) {
        this.typenoname = typenoname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStockaddress() {
        return stockaddress;
    }

    public void setStockaddress(String stockaddress) {
        this.stockaddress = stockaddress;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    private Date orderdate;

    public String getDingjin() {
        return dingjin;
    }

    public void setDingjin(String dingjin) {
        this.dingjin = dingjin;
    }

    public String getCollectionway() {
        return collectionway;
    }

    public void setCollectionway(String collectionway) {
        this.collectionway = collectionway;
    }

    public String getCollectionmoney() {
        return collectionmoney;
    }

    public void setCollectionmoney(String collectionmoney) {
        this.collectionmoney = collectionmoney;
    }

    public Double getSumprice() {
        return sumprice;
    }

    public void setSumprice(Double sumprice) {
        this.sumprice = sumprice;
    }
}
