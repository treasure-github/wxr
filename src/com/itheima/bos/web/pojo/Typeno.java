package com.itheima.bos.web.pojo;

public class Typeno {
    private String typenoid;

    private String typenoname;

    private String producttypeid;

    public String getTypenoid() {
        return typenoid;
    }

    public void setTypenoid(String typenoid) {
        this.typenoid = typenoid == null ? null : typenoid.trim();
    }

    public String getTypenoname() {
        return typenoname;
    }

    public void setTypenoname(String typenoname) {
        this.typenoname = typenoname == null ? null : typenoname.trim();
    }

    public String getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(String producttypeid) {
        this.producttypeid = producttypeid == null ? null : producttypeid.trim();
    }
}