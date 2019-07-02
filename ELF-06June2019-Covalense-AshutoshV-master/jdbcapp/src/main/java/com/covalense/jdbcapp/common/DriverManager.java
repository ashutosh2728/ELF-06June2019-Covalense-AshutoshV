package com.covalense.jdbcapp.common;

public class DriverManager {

	private DriverManager() {

	}

	public static Connection getConnection(String str) {
		Connection ref = null;
		if (str.equals("one")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;
	}// End of getInstance()

}// End of Class
