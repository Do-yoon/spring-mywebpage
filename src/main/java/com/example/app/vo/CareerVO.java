package com.example.app.vo;

public class CareerVO {

    private Integer id;
    private String company;
    private String date1;
    private String date2;
    private String intro;

    public Integer getId() {
        return id;
    }

    public void setId(int number) {
        this.id = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

}
