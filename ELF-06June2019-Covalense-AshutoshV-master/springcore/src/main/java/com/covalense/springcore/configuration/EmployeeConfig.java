package com.covalense.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.springcore.beans.EmployeeBean;

@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {
	@Bean
	public EmployeeBean getEmployeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setId(101);
		employeeBean.setName("Ashutosh");
		return employeeBean;
	}

}
