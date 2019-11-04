package com.example.app.controller.mapper;

import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiMapper {
    List<CareerVO> selectCareerList();
    List<CareerVO> selectCareer(int n);
    List<ProjectVO> selectProjectList();
    List<ProjectVO> selectProject(int n);
    // ProfileVO selectProfile();
    // TriviaVO selectTrivia();
}
