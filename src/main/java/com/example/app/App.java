package com.example.app;

import com.example.app.mapper.AdminMenuMapper;
import com.example.app.service.AdminMenuService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication(scanBasePackages = {"com.example.app"})
@MapperScan(basePackages = {"com.example.app.mapper"})
@EnableJpaRepositories(basePackages = {"com.example.app.mapper", "com.example.app.dao"})
public class App {

	public static void main(String[] args) {
		String resource = "webapp/WEB-INF/resources/mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (SqlSession session = sqlSessionFactory.openSession()) {
			AdminMenuMapper mapper = session.getMapper(AdminMenuMapper.class);
			// do work
		}

		SpringApplication.run(App.class, args);
	}

}
