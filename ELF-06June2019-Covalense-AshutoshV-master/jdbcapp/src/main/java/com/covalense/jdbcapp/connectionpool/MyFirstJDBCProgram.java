package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import lombok.extern.java.Log;

@Log
public final class MyFirstJDBCProgram {
	public static void main(String[] args) {
		Connection con = null;
		ConnectionPool pool = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();
			String query = "select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

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
			pool.returnConnectionToPool(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
