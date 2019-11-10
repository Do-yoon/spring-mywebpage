package com.example.app.controller.mapper;

import com.example.app.vo.AdminVO;

import javax.servlet.http.HttpSession;

public interface AdminLoginMapper {
    public boolean loginCheck(AdminVO admin);
    public AdminVO viewAdmin(AdminVO admin);
    public void logout(HttpSession session);
}
