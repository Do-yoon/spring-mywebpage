package com.example.app.mapper;

import com.example.app.vo.AdminVO;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;

// @Repository
public interface AdminLoginMapper {
    boolean loginCheck(AdminVO admin);
    AdminVO viewAdmin(AdminVO admin);
    void logout(HttpSession session);
}
