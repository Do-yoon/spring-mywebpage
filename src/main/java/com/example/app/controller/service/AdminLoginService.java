package com.example.app.controller.service;

import com.example.app.controller.mapper.AdminLoginMapper;
import com.example.app.vo.AdminVO;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdminLoginService {

    // @Inject
    private AdminLoginMapper adminLoginMapper;

    public boolean loginCheck(AdminVO admin, HttpSession session){
        boolean result = adminLoginMapper.loginCheck(admin);
        if(result) {
            AdminVO admin2 = viewAdmin(admin);
            session.setAttribute("userId", admin2.getId());
        }
        return result;
    }

    public AdminVO viewAdmin(AdminVO admin){
        return adminLoginMapper.viewAdmin(admin);
    }

    public void logout(HttpSession session){
        session.invalidate();
    }
}
