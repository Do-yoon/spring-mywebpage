package com.example.app.dao;

import com.example.app.vo.AdminVO;

import javax.servlet.http.HttpSession;

public interface AdminDAO {
    public boolean loginCheck(AdminVO admin);
    public AdminVO viewAdmin(AdminVO admin);
    public void logout(HttpSession session);
}
