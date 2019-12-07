package com.example.app.controller;

import com.example.app.service.AdminMenuService;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@Component
@RequestMapping("/admin/category")
public class AdminMenuController {

    // private static final Logger logger = Logger.getGlobal();

    // to do: project와 career의 put method와 post method의 분리 필요
    @Autowired
    private AdminMenuService adminMenuService;

    @RequestMapping(value = "/profile", method = {RequestMethod.PUT}) //patch 사용하지 않음
    public ResponseEntity<?> updateProfile(@RequestBody ProfileVO profileVO){
        ResponseEntity<String> entity = null;
        try {
            JSONObject jsonObject = new JSONObject();
            JSONObject newProfile = new JSONObject();

            newProfile.put("name", profileVO.getName());
            newProfile.put("intro", profileVO.getIntro());
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/project/{id}", method = {RequestMethod.PUT})
    public ResponseEntity<?> updateProject(@RequestBody ProjectVO projectVO, @PathVariable("id") Integer id) {
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

    @RequestMapping(value = "/career/{id}", method = {RequestMethod.PUT})
    public ResponseEntity<?> updateCareer(@RequestBody CareerVO careerVO, @PathVariable("id") Integer id) {
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
    

    @RequestMapping(value = "/trivia", method = {RequestMethod.PUT})
    public ResponseEntity<?> updateTrivia(@RequestBody TriviaVO triviaVO){
        ResponseEntity<String> entity = null;
        try {
            JSONObject jsonObject = new JSONObject();
            JSONObject newProfile = new JSONObject();

            // newProfile.put("name", triviaVO.getInfo());

            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/project/{id}", method = {RequestMethod.DELETE})
    public ResponseEntity<?> deleteProject(@PathVariable Integer id) {
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

    @RequestMapping(value = "/career/{id}", method = {RequestMethod.DELETE})
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

    @GetMapping("/{menu}") //메뉴에 따른 수정 폼 띄우기
    public String inputForm(@PathVariable String menu){
        return "data/admin/" + menu;
    }

    @RequestMapping(value = "/project", method = {RequestMethod.POST})
    public ResponseEntity<?> insertProject(@PathVariable("id") Integer id, ProjectVO projectVO) {
        ResponseEntity<String> entity = null;
        try {
            adminMenuService.insertProject(projectVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    @RequestMapping(value = "/career", method = {RequestMethod.POST})
    public ResponseEntity<?> insertCareer(@PathVariable("id") Integer id, CareerVO careerVO) {
        ResponseEntity<String> entity = null;
        try {
            adminMenuService.insertCareer(careerVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }
}
