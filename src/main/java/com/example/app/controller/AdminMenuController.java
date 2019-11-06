package com.example.app.controller;

import com.example.app.vo.ProfileVO;
import com.example.app.vo.TriviaVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin/category")
public class AdminMenuController {

    private static final Logger logger = Logger.getGlobal();

    @RequestMapping(value = "/profile", method = RequestMethod.PUT)
    public ResponseEntity<ProfileVO> profile(@PathVariable String menu, HttpSession session){
        ProfileVO profileVO = new ProfileVO();
        if (profileVO == null){
            return new ResponseEntity<ProfileVO>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ProfileVO>(profileVO, HttpStatus.OK);
    }

    @GetMapping("/{menu}")
    public String inputForm(@PathVariable String menu){
        return "data/admin/" + menu;
    }

}
