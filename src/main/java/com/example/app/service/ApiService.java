package com.example.app.service;

import com.example.app.mapper.ApiMapper;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
@Transactional
public class ApiService {

    @Autowired
    private ApiMapper apiMapper;


    public List<CareerVO> selectCareerList() {
        return apiMapper.selectCareerList();
    }
    public CareerVO selectCareer(int n){
        return apiMapper.selectCareer(n);
    }
    public void updateCareer(CareerVO careerVO) {
        apiMapper.updateCareer(careerVO);
    }
    public void insertCareer(CareerVO careerVO) {
        apiMapper.insertCareer(careerVO);
    }
    public void deleteCareer(Integer id) {
        apiMapper.deleteCareer(id);
    }

    public List<ProjectVO> selectProjectList() {
        return apiMapper.selectProjectList();
    }
    public ProjectVO selectProject(int n){
        return apiMapper.selectProject(n);
    }
    public void updateProject(ProjectVO projectVO) {
        apiMapper.updateProject(projectVO);
    }
    public void insertProject(ProjectVO projectVO) {
        apiMapper.insertProject(projectVO);
    }
    public void deleteProject(Integer id) {
        apiMapper.deleteProject(id);
    }

}
