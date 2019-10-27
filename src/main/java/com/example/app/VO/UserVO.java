package com.example.app.VO;

import lombok.Data;

@Data
public class UserVO {

    private String name;
    private String phone;

    public UserVO(){}
    public UserVO(String name, String phone) {
        super();
        this.name = name;
        this.phone = phone;
    }

}