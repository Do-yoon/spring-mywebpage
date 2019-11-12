package com.example.app.vo;

import java.util.Date;

public class AdminVO {
    private String id;
    private String pw;
    private String lastLoginDate;

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setLastLoginDate(String now) {
        this.lastLoginDate = now;
    }
}
