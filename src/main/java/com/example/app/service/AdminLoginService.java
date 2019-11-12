package com.example.app.service;

import com.example.app.dao.AdminLoginDAO;
import com.example.app.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class AdminLoginService {

    @Autowired
    private AdminLoginDAO adminLoginDao;

    public boolean loginCheck(AdminVO admin, HttpSession session){
        boolean result = adminLoginDao.loginCheck(admin); // login logic needed
        if(result) {
            AdminVO admin2 = viewAdmin(admin);
            session.setAttribute("id", admin2.getId());
        }
        return result;
    }

    public AdminVO viewAdmin(AdminVO admin){
        return adminLoginDao.viewAdmin(admin);
    }

    public void logout(HttpSession session){
        session.invalidate();
    }
}
