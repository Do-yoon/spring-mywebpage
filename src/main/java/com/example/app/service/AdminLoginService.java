package com.example.app.service;

import com.example.app.mapper.AdminLoginMapper;
import com.example.app.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Service
public class AdminLoginService {
/*
    @Autowired
    private AdminLoginMapper adminLoginMapper;

    public boolean loginCheck(AdminVO admin, HttpSession session){
        boolean result = adminLoginMapper.loginCheck(admin); // login logic needed
        if(result) {
            AdminVO admin2 = viewAdmin(admin);
            session.setAttribute("id", admin2.getId());
        }
        return result;
    }

    public AdminVO viewAdmin(AdminVO admin){
        return adminLoginMapper.viewAdmin(admin);
    }

    public void logout(HttpSession session){
        session.invalidate();
    }

 */
}
