package com.covalense.statementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lombok.extern.java.Log;

@Log
public final class PreparedStatementExampleThree {
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
			String query = "insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, args[3]);
			pstmt.setDouble(5, Double.parseDouble(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7, args[6]);
			pstmt.setInt(8, Integer.parseInt(args[7]));
			pstmt.setString(9, args[8]);
			pstmt.setString(10, args[9]);
			pstmt.setString(11, args[10]);
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));

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
