package com.example.app.mapper;

import com.example.app.vo.CareerVO;
import com.example.app.vo.ProfileVO;
import com.example.app.vo.ProjectVO;
import com.example.app.vo.TriviaVO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// to do: MenuVO 만들어 상속하게 하는 방법 사용하자.
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
