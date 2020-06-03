package com.itheima.bos.web.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Application {
    private String id;

    private String username;

    private String gender;

    private String phone;

    private String job;

    @Override
    public String toString() {
        return "Application{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", job='" + job + '\'' +
                ", reason='" + reason + '\'' +
                ", sal=" + sal +
                ", impression='" + impression + '\'' +
                ", applicationdate=" + applicationdate +
                '}';
    }

    private String reason;

    private BigDecimal sal;

    private String impression;

    private Date applicationdate;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression == null ? null : impression.trim();
    }

    public Date getApplicationdate() {
        return applicationdate;
    }

    public void setApplicationdate(Date applicationdate) {
        this.applicationdate = applicationdate;
    }
}