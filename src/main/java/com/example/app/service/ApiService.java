package com.example.app.service;

import com.example.app.mapper.ApiMapper;
import com.example.app.vo.CareerVO;
import com.example.app.vo.ProjectVO;
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
