package com.covalense.myfirstjdbctrywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class MyFirstJDBCProgram {
	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select * from employee_info";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			while (rs.next()) {

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

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} // End of try-catch
	}// End of main
}// End of class
