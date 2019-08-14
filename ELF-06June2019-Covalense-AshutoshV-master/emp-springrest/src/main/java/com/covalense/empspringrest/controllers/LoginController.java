package com.covalense.empspringrest.controllers;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.empspringrest.dao.EmployeeDAO;
import com.covalense.empspringrest.dto.EmployeeInfoBean;

@RestController
@RequestMapping("login")
public class LoginController {
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password, HttpServletRequest request) {
		EmployeeInfoBean bean = dao.getEmployeeInfo(id);
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null && bean.getPassword().equals(password)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Login successfully");
			response.setBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not found");
		}
		return response;
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Logout successfully");
		return response;
	}

	@GetMapping(value = "/readCookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("JSESSIONID : " + sessionId);
		return response;
	}

}
