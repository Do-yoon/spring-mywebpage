package com.example.app.mapper;

import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMenuMapper {
    // void updateProfile(ProfileVO profileVO);
    void updateProject(ProjectVO projectVO);
    // void updateTrivia(TriviaVO triviaVO);
    void updateCareer(CareerVO careerVO);
    void deleteProject(Integer id);
    void deleteCareer(Integer id);
    void insertProject(ProjectVO projectVO);
    void insertCareer(CareerVO careerVO);
}
