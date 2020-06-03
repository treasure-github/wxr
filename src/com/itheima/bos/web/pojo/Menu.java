package com.itheima.bos.web.pojo;

import java.io.Serializable;

/**
 * @Description 菜单类
 * @Author hws
 * @CreateDate 2020/3/23 10:02
 */
public class Menu implements Serializable {
    private String id;
    private String name;
    private String pageAction;
    private String pid;
    private String menusort;
    private String userId;
    private String pmenu;

    public String getPmenu() {
        return pmenu;
    }

    public void setPmenu(String pmenu) {
        this.pmenu = pmenu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPageAction() {
        return pageAction;
    }

    public void setPageAction(String pageAction) {
        this.pageAction = pageAction;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMenusort() {
        return menusort;
    }

    public void setMenusort(String menusort) {
        this.menusort = menusort;
    }

    public Menu() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Menu(String id, String name, String pageAction, String pid, String menusort, String userId, String pmenu) {
        this.id = id;
        this.name = name;
        this.pageAction = pageAction;
        this.pid = pid;
        this.menusort = menusort;
        this.userId = userId;
        this.pmenu = pmenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pageAction='" + pageAction + '\'' +
                ", pid='" + pid + '\'' +
                ", menusort='" + menusort + '\'' +
                ", userId='" + userId + '\'' +
                ", pmenu='" + pmenu + '\'' +
                '}';
    }
}
