package com.example.app.controller;

import com.example.app.dao.AdminDAO;
import com.example.app.vo.AdminVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService {

    //@Inject
    AdminDAO adminDAO;

    @Override
    public boolean loginCheck(AdminVO admin, HttpSession session){
        boolean result = adminDAO.loginCheck(admin);
        if(result) {
            AdminVO admin2 = viewAdmin(admin);
            session.setAttribute("userId", admin2.getId());
        }
        return result;
    }

    @Override
    public AdminVO viewAdmin(AdminVO admin){
        return adminDAO.viewAdmin(admin);
    }

    @Override
    public void logout(HttpSession session){
        session.invalidate();
    }
}
