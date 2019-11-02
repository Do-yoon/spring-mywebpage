package com.example.app.dao;

import com.example.app.vo.AdminVO;
import org.apache.ibatis.session.SqlSession;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

public class AdminDAOImpl implements AdminDAO {
    @Inject
    SqlSession sqlSession;

    @Override
    public boolean loginCheck(AdminVO admin) {
        String name = sqlSession.selectOne("member.loginCheck", admin);
        return (name != null);
    }

    @Override
    public AdminVO viewAdmin(AdminVO admin){
        return sqlSession.selectOne("member.viewAdmin", admin);
    }

    @Override
    public void logout(HttpSession session){}
}
