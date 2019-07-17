package com.covalense.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	@Bean(name = "it")
	public DepartmentBean getDepartmentBeanIt() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(900);
		departmentBean.setDeptName("IT");
		return departmentBean;
	}

	@Bean(name = "hr")
	public DepartmentBean getDepartmentBeanHr() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(925);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}

	@Bean(name = "testing")
	public DepartmentBean getDepartmentBeanTesting() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(905);
		departmentBean.setDeptName("TESTING");
		return departmentBean;
	}
}
