package com.covalense.lms.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.AdminResponse;
import com.covalense.lms.dto.BookInfoBean;
import com.covalense.lms.dto.BookIssueBean;
import com.covalense.lms.dto.BookIssueBeanResponse;
import com.covalense.lms.dto.UserInfoBean;
import com.covalense.lms.repository.AdminRepository;
import com.covalense.lms.repository.BookAllocateRepository;
import com.covalense.lms.repository.LibrarianRepository;

//@CrossOrigin("http://localhost:3000")
@EntityScan(basePackages = "com.covalense.lms")
@RestController
public class BookAllocateController {
	@Autowired
	BookAllocateRepository bookAllocateRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	LibrarianRepository librarianRepository;
	
	@PatchMapping(path = "/allocate", produces = MediaType.APPLICATION_JSON_VALUE)
	public BookIssueBeanResponse changeAllotmentStatus(@RequestBody UserInfoBean userInfoBean,Integer id) {
		BookIssueBeanResponse response = new BookIssueBeanResponse();
		int userId=userInfoBean.getUserId();
		BookIssueBean bookIssueBean = bookAllocateRepository.findById(id).get();
		bookAllocateRepository.save(bookIssueBean);
		if( adminRepository.existsById(userId)) {
			response.setStatusCode(200);
			response.setDescription("Book Issued");
			response.setMessage("Success");
			response.setBookIssueBeanResponse(Arrays.asList(bookIssueBean));
		} else {
			response.setStatusCode(401);
			response.setDescription("Book not Issued");
			response.setMessage("Failure");
		}
	
	
	
	return response;
}
}
