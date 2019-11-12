package com.example.app.controller;

import com.example.app.service.AdminMenuService;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("/admin/category")
public class AdminMenuController {

    private static final Logger logger = Logger.getGlobal();

    // to do: AdminMenuService 만들고, mapper에서 DB Update query문을 수행한다.
    // to do: AdminLoginMapper의 Mapper.xml 필요
    private AdminMenuService adminMenuService;

    @RequestMapping(value = "/update/profile", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<?> profile(@RequestBody ProfileVO profileVO){
        ResponseEntity<String> entity = null;
        try {
            adminMenuService.updateProfile(profileVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/update/project/{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<?> project(@RequestBody ProjectVO projectVO, @PathVariable("id") Integer id) {
        ResponseEntity<String> entity = null;
        try {
            projectVO.setId(id);
            adminMenuService.updateProject(projectVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/update/career/{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<?> career(@RequestBody CareerVO careerVO, @PathVariable("id") Integer id) {
        ResponseEntity<String> entity = null;
        try {
            careerVO.setId(id);
            adminMenuService.updateCareer(careerVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/update/trivia", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<?> trivia(@RequestBody TriviaVO triviaVO){
        ResponseEntity<String> entity = null;
        try {
            adminMenuService.updateTrivia(triviaVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/delete/project/{id}", method = {RequestMethod.DELETE})
    public ResponseEntity<?> deleteProfile(@PathVariable Integer id) {
        ResponseEntity<String> entity = null;
        try {
            adminMenuService.deleteProject(id);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/delete/career/{id}", method = {RequestMethod.PUT, RequestMethod.PATCH})
    public ResponseEntity<?> deleteCareer(@PathVariable("id") Integer id) {
        ResponseEntity<String> entity = null;
        try {
            adminMenuService.deleteCareer(id);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }


    @GetMapping("/{menu}")
    public String inputForm(@PathVariable String menu){
        return "data/admin/" + menu;
    }

}
