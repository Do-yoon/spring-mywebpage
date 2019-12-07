package com.example.app.service;

import com.example.app.mapper.AdminMenuMapper;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
@Transactional
public class AdminMenuService {

    @Autowired
    private AdminMenuMapper adminMenuMapper;

    public void updateProject(ProjectVO projectVO) {
        adminMenuMapper.updateProject(projectVO);
    }
    public void updateCareer(CareerVO careerVO) {
        adminMenuMapper.updateCareer(careerVO);
    }
    public void deleteProject(Integer id) {
        adminMenuMapper.deleteProject(id);
    }
    public void deleteCareer(Integer id) {
        adminMenuMapper.deleteCareer(id);
    }
    public void insertProject(ProjectVO projectVO) {
        adminMenuMapper.insertProject(projectVO);
    }
    public void insertCareer(CareerVO careerVO) {
        adminMenuMapper.insertCareer(careerVO);
    }
}
