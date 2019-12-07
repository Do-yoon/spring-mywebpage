package com.example.app;

import com.example.app.controller.AdminMenuController;
import com.example.app.service.AdminLoginService;
import com.example.app.service.AdminMenuService;
import com.example.app.service.ApiService;
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
@Transactional
// @Ignore
public class AppTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private AdminMenuController adminMenuController;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(adminMenuController).build();
	}

/*	@Test
	public void apiServiceTest() {
		apiService.selectCareerList();
	}*/

	@Test
	public void adminMenuServiceTest() throws Exception {
		// given
		final ProfileVO profileVO = new ProfileVO();

		// when
		ResponseEntity<?> entity = adminMenuController.updateProfile(profileVO);

		// then
		System.out.println(entity.getStatusCode());
	}

/*	@Test
	public void adminLoginServiceTest() {
		AdminVO adminVO = new AdminVO();
		HttpSession httpSession = new HttpSession() {
			@Override
			public long getCreationTime() {
				return 0;
			}

			@Override
			public String getId() {
				return null;
			}

			@Override
			public long getLastAccessedTime() {
				return 0;
			}

			@Override
			public ServletContext getServletContext() {
				return null;
			}

			@Override
			public void setMaxInactiveInterval(int i) {

			}

			@Override
			public int getMaxInactiveInterval() {
				return 0;
			}

			@Override
			public HttpSessionContext getSessionContext() {
				return null;
			}

			@Override
			public Object getAttribute(String s) {
				return null;
			}

			@Override
			public Object getValue(String s) {
				return null;
			}

			@Override
			public Enumeration<String> getAttributeNames() {
				return null;
			}

			@Override
			public String[] getValueNames() {
				return new String[0];
			}

			@Override
			public void setAttribute(String s, Object o) {

			}

			@Override
			public void putValue(String s, Object o) {

			}

			@Override
			public void removeAttribute(String s) {

			}

			@Override
			public void removeValue(String s) {

			}

			@Override
			public void invalidate() {

			}

			@Override
			public boolean isNew() {
				return false;
			}
		};
		adminLoginService.loginCheck(adminVO, httpSession);
	}*/

}
