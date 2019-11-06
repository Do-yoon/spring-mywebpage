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

    // to do: AdminMenuService 만들고, mapper에서 DB Update query문을 수행한다.

    @RequestMapping(value = "/profile", method = RequestMethod.PUT)
    public ResponseEntity<?> profile(@PathVariable String menu, HttpSession session){
        ProfileVO profileVO = new ProfileVO();
        if (profileVO == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(profileVO, HttpStatus.OK);
    }

    @GetMapping("/{menu}")
    public String inputForm(@PathVariable String menu){
        return "data/admin/" + menu;
    }

}
