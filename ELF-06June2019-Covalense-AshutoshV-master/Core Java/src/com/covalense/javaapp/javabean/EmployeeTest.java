package com.covalense.javaapp.copy.javabean;

import java.util.logging.Logger;

public class EmployeeTest {
	private static final Logger logger = Logger.getLogger("MainMethodContent");

	public static void main(String[] args) {
		EmployeeBean e1 = new EmployeeBean();
		logger.info("Without Lomboj----" + e1.toString());

		EmployeeBean2 e = new EmployeeBean2();
		e.setAge(12);
		e.setGender("Male");	
		logger.info("With Lomboj----" + e.toString());
	}

}
