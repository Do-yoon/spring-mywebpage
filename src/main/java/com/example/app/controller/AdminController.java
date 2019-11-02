package com.example.app.controller;

import com.example.app.log.Log;
import com.example.app.vo.AdminVO;
import com.example.app.vo.ProfileVO;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.InputStream;

@RestController
@RequestMapping("/admin")
public class AdminController {
    //String res = ""; // mybatis configuration file path
    private static final Log log = new Log();

    //@Inject
    MemberService memberService;

    @RequestMapping("/login.do")
    public String login(){
        return "/admin/login"; // view/admin/login.jsp로 포워딩
    }

    @RequestMapping("/loginCheck.do")
    public ModelAndView loginCheck(@ModelAttribute AdminVO admin, HttpSession session){
        boolean result = memberService.loginCheck(admin, session);
        ModelAndView mav = new ModelAndView();
        if (result) {
            mav.setViewName("home");
            mav.addObject("msg", "success");
        } else {
            mav.setViewName("admin/login");
            mav.addObject("msg", "failure");
        }
        return mav;
    }

    @RequestMapping("/logout.do")
    public ModelAndView logout(HttpSession session){
        memberService.logout(session);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin/login");
        return mav;
    }

    @RequestMapping(value = "/{category}", method = RequestMethod.PUT)
    public void profile(@PathVariable String category, HttpServletRequest req){
        switch (category){
            case "profile":
            case "trivia":
                break;
            case "project":
            case "career":
                break;
        }
    }
}
