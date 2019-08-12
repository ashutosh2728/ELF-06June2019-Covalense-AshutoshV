package com.covalense.empspringrest.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {
	}

	@Bean("hibernate")
	public static EmployeeDAO getHibernateInstance() {
		return new EmployeeDAOHibernateImpl();
	}

	@Bean("jdbc")
	public static EmployeeDAO getJDBCInstance() {
		return new EmployeeDAOJDBCImpl();
	}
}// End of Class
