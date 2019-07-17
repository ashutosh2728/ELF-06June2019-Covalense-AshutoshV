package com.covalense.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class EmployeeBean {
	private String name;
	private int id;
	@Autowired
	@Qualifier("it")
	private DepartmentBean departmentBean;

	/*
	 * public void destroy() throws Exception { log.info("Distroy phase....");
	 * 
	 * }
	 * 
	 * public void afterPropertiesSet() throws Exception {
	 * log.info("Initialising phase...");
	 * 
	 * }
	 */

}
