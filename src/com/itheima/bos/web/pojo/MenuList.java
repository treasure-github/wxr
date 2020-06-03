package com.itheima.bos.web.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 构造菜单类
 * @Author hws
 * @CreateDate 2020/3/23 9:59
 */
public class MenuList implements Serializable {
    private String id;
    private String name;
    private String value;
    private List<Menu> menuList;

    public MenuList() {
    }

    public MenuList(String id, String name, List<Menu> menuList) {
        this.id = id;
        this.name = name;
        this.menuList = menuList;
    }

    public MenuList(String id, List<Menu> menuList) {
        this.id = id;
        this.menuList = menuList;
    }

    public String getPid() {
        return id;
    }

    public void setPid(String id) {
        this.id = id;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
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

    public MenuList(String id, String name, String value, List<Menu> menuList) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.menuList = menuList;
    }

    public String getMenu() {
        return value;
    }

    public void setMenu(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MenuList{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", menuList=" + menuList +
                '}';
    }
}
