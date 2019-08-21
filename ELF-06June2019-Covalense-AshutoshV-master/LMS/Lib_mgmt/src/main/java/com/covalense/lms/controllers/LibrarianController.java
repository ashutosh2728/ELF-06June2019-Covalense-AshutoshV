package com.covalense.lms.controllers;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.AdminResponse;
import com.covalense.lms.dto.BookInfoBean;
import com.covalense.lms.repository.AdminRepository;
import com.covalense.lms.repository.LibrarianRepository;


@CrossOrigin("http://localhost:3000")
@EntityScan(basePackages = "com.covalense.lms")
@RestController
public class LibrarianController {
	@Autowired
	LibrarianRepository repository;
	@PostMapping(path = "/createBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse createEmoployee(@RequestBody BookInfoBean bookInfoBean) {

	AdminResponse response = new AdminResponse();
		if (!repository.existsById(bookInfoBean.getBookId())){
			repository.save(bookInfoBean);
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


}
