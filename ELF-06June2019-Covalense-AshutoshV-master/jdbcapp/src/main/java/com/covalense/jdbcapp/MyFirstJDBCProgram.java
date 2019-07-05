package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class MyFirstJDBCProgram {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1. Load the Driver
			/*
			 * Driver driver = new Driver(); DriverManager.registerDriver(driver);
			 */
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. Get the DB Connection via Driver
			// String dbUrl =
			// "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			// con = DriverManager.getConnection(dbUrl);
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			// 3. Issue "SQL Queries via Connection"

			log.info("" + con.getClass());
			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			// 4. Process the results returned by Sql queries
			while (rs.next()) {
				/*
				 * log.info("ID ===>" + rs.getInt("ID")); log.info("NAME ===>" +
				 * rs.getString("NAME"));
				 */
				log.info("ID ===>" + rs.getInt(1));
				log.info("NAME ===>" + rs.getString(2));
				log.info("AGE ===>" + rs.getInt("AGE"));
				log.info("GENDER ===>" + rs.getString("GENDER"));
				log.info("SALARY ===>" + rs.getDouble("SALARY"));
				log.info("PHONE ===>" + rs.getInt("PHONE"));
				log.info("JOINING_DATE ===>" + rs.getDate("JOINING_DATE"));
				log.info("ACCOUNT_NUMBER ===>" + rs.getInt("ACCOUNT_NUMBER"));
				log.info("EMAIL ===>" + rs.getString("EMAIL"));
				log.info("DESIGNATION ===>" + rs.getString("DESIGNATION"));
				log.info("DOB ===>" + rs.getDate("DOB"));
				log.info("DEPT_ID ===>" + rs.getInt("DEPT_ID"));
				log.info("MNGR_ID ===>" + rs.getInt("MNGR_ID"));
			} // End of while

		} catch (Exception e) {
			e.printStackTrace();
		} /*
			 * finally { // 5. Close All "JDBC Objects" { try { if (con != null) {
			 * con.close();
			 * 
			 * } if (stmt != null) { stmt.close(); } if (rs != null) { rs.close(); } } catch
			 * (SQLException e) { e.printStackTrace(); } } }
			 */
	}
}
