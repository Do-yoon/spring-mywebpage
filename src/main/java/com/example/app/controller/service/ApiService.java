package com.example.app.controller.service;

import com.example.app.controller.mapper.ApiMapper;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ApiService {

    @Autowired
    ApiMapper apiMapper;

    public List<CareerVO> selectCareerList() {
        return apiMapper.selectCareerList();
    }

    public List<CareerVO> selectCareer(int n){
        return apiMapper.selectCareer(n);
    }

    public List<ProjectVO> selectProjectList() {
        return apiMapper.selectProjectList();
    }

    public List<ProjectVO> selectProject(int n){
        return apiMapper.selectProject(n);
    }

}
