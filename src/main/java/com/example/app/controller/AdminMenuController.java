package com.example.app.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Component
@RequestMapping("/admin")
public class AdminMenuController {

    // private static final Logger logger = Logger.getGlobal();

    // 메뉴 영역
    @GetMapping("/{menu}")
    public String inputForm(@PathVariable String menu){
        return "data/admin/" + menu;
    }

}
