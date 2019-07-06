package com.covalense.designpattern.dao;

public class EmployeeDAOFactory {
	private static String dbInteractionType = "hibernate";

	private EmployeeDAOFactory() {

	}

	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl2();
		}
		return dao;
	}// End of getInstance()

}// End of Class
