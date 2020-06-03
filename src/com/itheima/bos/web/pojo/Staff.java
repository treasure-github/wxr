package com.itheima.bos.web.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Staff implements Serializable {
    private String id;

    private String username;

    private String gender;

    private String companyphone;

    private String phone;

    private String job;

    private String upassword;

    private String homeaddres;

    private String urgentman;

    private String urgentmanphone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginjobtime;
    private String[] roleids;
    private String rolename;

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", companyphone='" + companyphone + '\'' +
                ", phone='" + phone + '\'' +
                ", job='" + job + '\'' +
                ", upassword='" + upassword + '\'' +
                ", homeaddres='" + homeaddres + '\'' +
                ", urgentman='" + urgentman + '\'' +
                ", urgentmanphone='" + urgentmanphone + '\'' +
                ", beginjobtime=" + beginjobtime +
                ", roleids=" + Arrays.toString(roleids) +
                ", rolename='" + rolename + '\'' +
                '}';
    }

    public String[] getRoleids() {
        return roleids;
    }

    public void setRoleids(String[] roleids) {
        this.roleids = roleids;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getCompanyphone() {
        return companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone == null ? null : companyphone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getHomeaddres() {
        return homeaddres;
    }

    public void setHomeaddres(String homeaddres) {
        this.homeaddres = homeaddres == null ? null : homeaddres.trim();
    }

    public String getUrgentman() {
        return urgentman;
    }

    public void setUrgentman(String urgentman) {
        this.urgentman = urgentman == null ? null : urgentman.trim();
    }

    public String getUrgentmanphone() {
        return urgentmanphone;
    }

    public void setUrgentmanphone(String urgentmanphone) {
        this.urgentmanphone = urgentmanphone == null ? null : urgentmanphone.trim();
    }

    public Date getBeginjobtime() {
        return beginjobtime;
    }

    public void setBeginjobtime(Date beginjobtime) {
        this.beginjobtime = beginjobtime;
    }
}