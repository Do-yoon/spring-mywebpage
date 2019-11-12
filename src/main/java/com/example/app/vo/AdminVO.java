package com.example.app.vo;

import java.util.Date;

public class AdminVO {
    private String id;
    private String pw;
    private Date lastLoginDate;

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setId() {
        this.id = id;
    }

    public void setPw() {
        this.pw = pw;
    }

    public void setLastLoginDate(Date now) {
        this.lastLoginDate = now;
    }
}
