package com.covalense.springcore.beans;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class EmployeeBean {
	private String name;
	private int id;
	private DepartmentBean bean;

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
