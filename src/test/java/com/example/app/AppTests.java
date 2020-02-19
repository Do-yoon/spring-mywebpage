package com.example.app;

import com.example.app.controller.AdminMenuController;
import com.example.app.controller.ApiController;
import com.example.app.vo.AdminVO;
import com.example.app.vo.ProfileVO;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@Ignore
public class AppTests {
/*
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ApiController apiController;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(apiController).build();
	}

	@Test
	public void apiServiceTest() {
		// apiService.selectCareerList();
	}
*/
}
