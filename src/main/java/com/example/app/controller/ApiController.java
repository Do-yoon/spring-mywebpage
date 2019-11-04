package com.example.app.controller;

import com.example.app.controller.service.ApiService;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@RequestMapping("/api")
public class ApiController {

    //private static final Logger logger = new Logger();
    @Autowired
    private ApiService apiService;

    @GetMapping("/profile")
    public ProfileVO profile() {
        ProfileVO profile = new ProfileVO();
        return profile;
    }

    @GetMapping("/trivia")
    public TriviaVO trivia() {
        TriviaVO trivia = new TriviaVO();
        return trivia;
    }

    @GetMapping("/project")
    public List<ProjectVO> project(@RequestParam(required = false, value = "id") String id) {
        if (id != null)
            return apiService.selectProject(Integer.parseInt(id));
        return apiService.selectProjectList();
    }

    @GetMapping("/career")
    public List<CareerVO> career(@RequestParam(required = false, value = "id") String id, Map<String, Object> commandMap) {
        if (id != null)
            return apiService.selectCareer(Integer.parseInt(id));
        return apiService.selectCareerList();
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
