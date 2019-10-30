package com.example.app.controller;

import com.example.app.vo.ProfileVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

@RestController
@RequestMapping("/admin")
public class AdminController {
    String res = ""; // mybatis configuration file path

    @RequestMapping
    public void cert(@RequestParam("id") String id, @RequestParam("pw") String pw){

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
