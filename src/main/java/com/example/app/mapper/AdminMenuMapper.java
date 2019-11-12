package com.example.app.mapper;

import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;

public interface AdminMenuMapper {
    public void updateProfile(ProfileVO profileVO);
    public void updateProject(ProjectVO projectVO);
    public void updateTrivia(TriviaVO triviaVO);
    public void updateCareer(CareerVO careerVO);
    public void deleteProject(Integer id);
    public void deleteCareer(Integer id);
    public void insertProject(ProjectVO projectVO);
    public void insertCareer(CareerVO careerVO);
}
