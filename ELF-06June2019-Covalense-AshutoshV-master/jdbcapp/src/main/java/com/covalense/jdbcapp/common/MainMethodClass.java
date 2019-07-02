package com.covalense.jdbcapp.common;

public class MainMethodClass {
	public static void main(String[] args) {
		Connection ref = DriverManager.getConnection(args[0]);
		ref.printMessage();

	}
}
