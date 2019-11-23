package com.example.app.controller;

import com.example.app.service.ApiService;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class ApiController {

    //private static final Logger logger = new Logger();
    @Autowired
    private ApiService apiService;

    @GetMapping("/profile")
    public ProfileVO profile() {
        ProfileVO profileVO = new ProfileVO();
        return profileVO;
    }

    @GetMapping("/profile/{id}")
    public @ResponseBody String profile(@PathVariable String id) throws IOException {
        InputStream in = getClass().getResourceAsStream("../data/profile/" + id + ".txt");
        return IOUtils.toString(in, "UTF-8");
    }

    @GetMapping("/trivia")
    public TriviaVO trivia() throws IOException {
        TriviaVO triviaVO = new TriviaVO();
        return triviaVO;
    }

    @GetMapping("/trivia/{id}")
    public @ResponseBody String trivia(@PathVariable String id) throws IOException {
        InputStream in = getClass().getResourceAsStream("../data/trivia/" + id + ".txt");
        return IOUtils.toString(in, "UTF-8");
    }

    @GetMapping(value = "/image/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] image(@PathVariable String id) throws IOException {
        InputStream in = getClass().getResourceAsStream("../resources/data/image/" + id + ".jpg");
        return IOUtils.toByteArray(in);
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
