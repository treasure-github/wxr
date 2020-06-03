package com.itheima.bos.web.pojo;


public class AuthFunction {

  private int id;
  private String name;
  private String code;
  private String description;
  private String page;
  private String generatemenu;
  private long zindex;
  private int pid;
  private long menusort;

  public AuthFunction() {
  }

  @Override
  public String toString() {
    return "AuthFunction{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", code='" + code + '\'' +
            ", description='" + description + '\'' +
            ", page='" + page + '\'' +
            ", generatemenu='" + generatemenu + '\'' +
            ", zindex=" + zindex +
            ", pid=" + pid +
            ", menusort=" + menusort +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public String getGeneratemenu() {
    return generatemenu;
  }

  public void setGeneratemenu(String generatemenu) {
    this.generatemenu = generatemenu;
  }

  public long getZindex() {
    return zindex;
  }

  public void setZindex(long zindex) {
    this.zindex = zindex;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public long getMenusort() {
    return menusort;
  }

  public void setMenusort(long menusort) {
    this.menusort = menusort;
  }
}
