package com.covalense.statementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class StatementExampleTwo {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rs;
		try {
			// 1. Load the Driver
			/*
			 * Driver driver = new Driver(); DriverManager.registerDriver(driver);
			 */
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. Get the DB Connection via Driver

			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			// 3. Issue "SQL Queries via Connection"

			log.info("" + con.getClass());
			String query = "insert into employee_info values(113,'Ashutosh',24,'Male',"
					+ "180000,144464564,'2016-05-18',456969649,'ashutosh.verma26@gmail.com'"
					+ ",'Software Engineer','1996-06-27',10,158)";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeUpdate();

			// 4. Process the results returned by Sql queries
			log.info("" + rs);
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 5. Close All "JDBC Objects"
			{
				try {
					if (con != null) {
						con.close();

					}
					if (pstmt != null) {
						pstmt.close();
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
