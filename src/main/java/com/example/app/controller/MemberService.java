package com.example.app.controller;

import com.example.app.vo.AdminVO;

import javax.servlet.http.HttpSession;

public interface MemberService {

    public boolean loginCheck(AdminVO admin, HttpSession session);
    public AdminVO viewAdmin(AdminVO admin);
    public void logout(HttpSession session);

}
