package com.covalense.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;
import com.covalense.springcore.configuration.EmployeeConfig;

import lombok.extern.java.Log;

@Log
public class AnnotedEmployeeTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employeeBean = applicationContext.getBean(EmployeeBean.class);

		log.info("ID : " + employeeBean.getId());
		log.info("Name : " + employeeBean.getName());
		DepartmentBean departmentBean = employeeBean.getDepartmentBean();
		log.info("ID : " + departmentBean.getDeptId());
		log.info("Name : " + departmentBean.getDeptName());

	}

}
