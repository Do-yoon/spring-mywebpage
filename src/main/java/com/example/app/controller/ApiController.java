package com.example.app.controller;

import com.example.app.service.ApiService;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@RestController
@Component
@RequestMapping("/api")
public class ApiController {

    //private static final Logger logger = new Logger();
    @Autowired
    private ApiService apiService;

    // 프로필 반환
    @GetMapping("/profile")
    public ProfileVO profile() {
        ProfileVO profileVO = new ProfileVO();
        return profileVO;
    }

    // 프로필 수정
    @RequestMapping(value = "/profile", method = {RequestMethod.PUT}) //patch 사용하지 않음
    public ResponseEntity<?> updateProfile(ProfileVO profileVO){
        ResponseEntity<String> entity = null;
        try {
            // apiService.updateProfile(profileVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }


    @GetMapping("/project/{id}")
    public ProjectVO project(@PathVariable int id) {
        return apiService.selectProject(id);
    }

    @GetMapping("/project/{id}")
    public List<ProjectVO> projectList() {
        return apiService.selectProjectList();
    }

    // 프로젝트 생성
    @RequestMapping(value = "/project", method = {RequestMethod.POST})
    public ResponseEntity<?> insertProject(@PathVariable("id") Integer id, ProjectVO projectVO) {
        ResponseEntity<String> entity = null;
        try {
            apiService.insertProject(projectVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    // 프로젝트 수정
    @RequestMapping(value = "/project/{id}", method = {RequestMethod.PUT})
    public ResponseEntity<?> updateProject(@RequestBody ProjectVO projectVO, @PathVariable("id") Integer id) {
        ResponseEntity<String> entity = null;
        try {
            projectVO.setId(id);
            apiService.updateProject(projectVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    // 프로젝트 삭제
    @RequestMapping(value = "/project/{id}", method = {RequestMethod.DELETE})
    public ResponseEntity<?> deleteProject(@PathVariable Integer id) {
        ResponseEntity<String> entity = null;
        try {
            apiService.deleteProject(id);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    // 커리어 상세 조회
    @GetMapping("/career/{id}")
    public CareerVO career(@PathVariable String id) {
        return apiService.selectCareer(Integer.parseInt(id));
    }

    // 커리어 리스트
    @GetMapping("/career/{id}")
    public List<CareerVO> careerList(@PathVariable String id) {
        return apiService.selectCareerList();
    }

    // 커리어 삽입
    @RequestMapping(value = "/career", method = {RequestMethod.POST})
    public ResponseEntity<?> insertCareer(@PathVariable("id") Integer id, CareerVO careerVO) {
        ResponseEntity<String> entity = null;
        try {
            apiService.insertCareer(careerVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    // 커리어 수정
    @RequestMapping(value = "/career/{id}", method = {RequestMethod.PUT})
    public ResponseEntity<?> updateCareer(@RequestBody CareerVO careerVO, @PathVariable("id") Integer id) {
        ResponseEntity<String> entity = null;
        try {
            careerVO.setId(id);
            apiService.updateCareer(careerVO);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    // 커리어 삭제
    @RequestMapping(value = "/career/{id}", method = {RequestMethod.DELETE})
    public ResponseEntity<?> deleteCareer(@PathVariable("id") Integer id) {
        ResponseEntity<String> entity = null;
        try {
            apiService.deleteCareer(id);
            entity = new ResponseEntity<String>("success", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return entity;
    }

    // 트리비아 조회
    @GetMapping("/trivia")
    public TriviaVO trivia() throws IOException {
        TriviaVO triviaVO = new TriviaVO();
        return triviaVO;
    }

    // 트리비아 수정
    @RequestMapping(value = "/trivia", method = {RequestMethod.PUT})
    public ResponseEntity<?> updateTrivia(TriviaVO triviaVO){
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

/*
    private String getJsonData(String uri){
        ClassPathResource resource = new ClassPathResource("data/" + uri + ".json");
        ResponseVO<List<ProfileVO>> resp = new ResponseVO<>();
        try {
            Path path = Paths.get(resource.getURI());
            List<String> content = Files.readAllLines(path);
            return new ResponseEntity<List<String>>(content, HttpStatus.OK);
        } catch (IOException e) {
            log.error("{}", e.getMessage(), e);
        }
    }
    */
}
