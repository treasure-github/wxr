package com.itheima.bos.web.pojo;

import java.math.BigDecimal;

public class DsModelinfo {
    private String modelinfoid;

    private String typename;

    private String typeno;

    private String brand;

    private String storeproductname;

    private BigDecimal productcost;

    public String getModelinfoid() {
        return modelinfoid;
    }

    public void setModelinfoid(String modelinfoid) {
        this.modelinfoid = modelinfoid == null ? null : modelinfoid.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTypeno() {
        return typeno;
    }

    public void setTypeno(String typeno) {
        this.typeno = typeno == null ? null : typeno.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getStoreproductname() {
        return storeproductname;
    }

    public void setStoreproductname(String storeproductname) {
        this.storeproductname = storeproductname == null ? null : storeproductname.trim();
    }

    public BigDecimal getProductcost() {
        return productcost;
    }

    public void setProductcost(BigDecimal productcost) {
        this.productcost = productcost;
    }
}