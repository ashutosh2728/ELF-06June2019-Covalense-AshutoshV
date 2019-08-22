package com.covalense.lms.controllers;

import java.util.Arrays;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.AdminResponse;
import com.covalense.lms.dto.UserInfoBean;
import com.covalense.lms.repository.AdminRepository;

@CrossOrigin("http://localhost:3000")
@EntityScan(basePackages = "com.covalense.lms")
@RestController
public class AdminController {
	@Autowired
	AdminRepository repository;

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse login(@RequestParam("userId")int id, String password,String userType, HttpServletRequest request) {
		AdminResponse response = new AdminResponse();
		UserInfoBean infoBean = repository.findById(id).get();
		if (infoBean != null && infoBean.getPassword().equals(password) && infoBean.getUserType().equals(userType)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Login successfully");
			response.setBeans(Arrays.asList(infoBean));
			request.getSession().setAttribute("bean", infoBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User data not found");
		}
		return response;
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse createEmoployee(@RequestBody UserInfoBean infoBean) {

	AdminResponse response = new AdminResponse();
		if (!repository.existsById(infoBean.getUserId())){
			repository.save(infoBean);
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("User Data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee id already exists");
		}
		return response;
	}
	
	@DeleteMapping(path = "/delete", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public AdminResponse deleteEmployee(@RequestParam("userId") int id) {
		AdminResponse response = new AdminResponse();
		// EmployeeInfoBean infoBean = repository.findById(id).get();
		if (repository.existsById(id)) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Employee data deleted successfully");
			repository.deleteById(id);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Employee data not found");
		}

		return response;

	}
	
	
}
