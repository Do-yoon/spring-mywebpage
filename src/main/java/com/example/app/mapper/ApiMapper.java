package com.example.app.mapper;

import com.example.app.vo.CareerVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiMapper {
    void updateProject(ProjectVO projectVO);
    void updateCareer(CareerVO careerVO);
    List<CareerVO> selectCareerList();
    CareerVO selectCareer(int n);
    void deleteCareer(Integer id);
    void insertProject(ProjectVO projectVO);
    List<ProjectVO> selectProjectList();
    ProjectVO selectProject(int n);
    void deleteProject(Integer id);
    void insertCareer(CareerVO careerVO);




    // ProfileVO selectProfile();
    // TriviaVO selectTrivia();
}
