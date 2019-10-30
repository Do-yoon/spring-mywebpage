package com.example.app.controller;

import com.example.app.log.Log;
import com.example.app.vo.AdminVO;
import com.example.app.vo.ProfileVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

@RestController
@RequestMapping("/admin")
public class AdminController {
    //String res = ""; // mybatis configuration file path
    private static final Log log = new Log();

    @RequestMapping("/login.do")
    public String login(){
        return "/admin/login";
    }

    @RequestMapping("/loginCheck.do")
    public String loginCheck(){
        return "/admin/login";
    }

    @RequestMapping("/logout.do")
    public String logout(){
        return "/admin/login";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.PUT)
    public void profile(HttpServletRequest req){

    }

    @RequestMapping(value = "/project/{id}", method = RequestMethod.PUT)
    public void project(HttpServletRequest req, @PathVariable("id") int id){

    }

    @RequestMapping(value = "/career/{id}", method = RequestMethod.PUT)
    public void career(HttpServletRequest req, @PathVariable("id") int id){

    }

    @RequestMapping(value = "/trivia", method = RequestMethod.PUT)
    public void trivia(HttpServletRequest req){

    }
}
