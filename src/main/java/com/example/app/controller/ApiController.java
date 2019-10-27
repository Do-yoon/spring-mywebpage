package com.example.app.controller;

import com.example.app.VO.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("/api")
public class ApiController {

    // Log log = new Log();

    @GetMapping("/{category}")
    public String profile(@PathVariable String category) {
        FileReader fr;
        try {
            fr = new FileReader("data/" + category + ".json");
            return fr.toString();
        } catch (FileNotFoundException e) { e.printStackTrace(); }
        return "error";
    }

    /*
    @GetMapping("/project/{id}")
    public String project(@PathVariable int id) {

    }

    @GetMapping("/career/{id}")
    public String career(@PathVariable int id) {

    }

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
