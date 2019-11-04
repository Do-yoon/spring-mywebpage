package com.example.app.controller.service;

import com.example.app.dao.AdminDAO;
import com.example.app.vo.AdminVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Service
public class MemberService {

    // @Inject
    private AdminDAO adminDAO;

    public boolean loginCheck(AdminVO admin, HttpSession session){
        boolean result = adminDAO.loginCheck(admin);
        if(result) {
            AdminVO admin2 = viewAdmin(admin);
            session.setAttribute("userId", admin2.getId());
        }
        return result;
    }

    public AdminVO viewAdmin(AdminVO admin){
        return adminDAO.viewAdmin(admin);
    }

    public void logout(HttpSession session){
        session.invalidate();
    }
}
