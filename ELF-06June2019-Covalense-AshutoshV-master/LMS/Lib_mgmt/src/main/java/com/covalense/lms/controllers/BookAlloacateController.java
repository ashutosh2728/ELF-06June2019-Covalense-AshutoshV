package com.covalense.lms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.AdminResponse;
import com.covalense.lms.dto.BookInfoBean;
import com.covalense.lms.dto.BookIssueBean;
import com.covalense.lms.dto.UserInfoBean;
import com.covalense.lms.repository.BookAllocateRepository;
import com.covalense.lms.repository.LibrarianRepository;

//@CrossOrigin("http://localhost:3000")
@EntityScan(basePackages = "com.covalense.lms")
@RestController
public class BookAlloacateController {
	
	
	@Autowired
	BookAllocateRepository repository;
	@PostMapping(path = "/issueBook", produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse issueBook(@RequestBody BookInfoBean bookInfoBean,@RequestBody UserInfoBean userInfoBean) {
		BookIssueBean bookIssueBean=null;
			bookIssueBean.setBookId(bookInfoBean);
			bookIssueBean.setUserId(userInfoBean);
		
		
		AdminResponse response = new AdminResponse();
		if (repository.existsById(bookInfoBean.getBookId())) {
			response.setStatusCode(201);
			response.setMessage("Successful");
			response.setDescription("Book data deleted successfully");
			repository.save(bookIssueBean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book data not found");
		}
		return response;
	}


}
