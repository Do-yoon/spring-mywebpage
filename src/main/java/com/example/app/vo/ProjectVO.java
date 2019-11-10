package com.example.app.vo;

import java.util.Date;

public class ProjectVO {

    private Integer id;
    private String name;
    private Date date1;
    private Date date2;
    private String intro;

    public int getId() {
        return id;
    }

    public void setId(Integer number) {
        this.id = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

}
