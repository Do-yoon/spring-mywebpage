package com.example.app.controller;

import com.example.app.service.AdminLoginService;
import com.example.app.vo.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@RestController
@Component
@RequestMapping("/admin")
public class AdminLoginController {
    //String res = ""; // mybatis configuration file path
    private static final Logger logger = Logger.getGlobal();

    @Autowired
    private AdminLoginService adminLoginService;

    @RequestMapping("")
    public String login(){
        return "admin/login/login"; // view/admin/login/login.jsp로 포워딩
    }

    @RequestMapping("/loginCheck.do")
    public ModelAndView loginCheck(@ModelAttribute AdminVO admin, HttpSession session){
        boolean result = adminLoginService.loginCheck(admin, session);
        ModelAndView mav = new ModelAndView();
        if (result) {
            mav.setViewName("profile");
            mav.addObject("msg", "success");
        } else {
            mav.setViewName("admin/login/login");
            mav.addObject("msg", "failure");
        }
        return mav;
    }

    @RequestMapping("/logout.do")
    public ModelAndView logout(HttpSession session){
        adminLoginService.logout(session);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin/login/login");
        return mav;
    }


}
