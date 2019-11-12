package com.example.app.mapper;

import com.example.app.vo.CareerVO;
import com.example.app.vo.ProjectVO;
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
