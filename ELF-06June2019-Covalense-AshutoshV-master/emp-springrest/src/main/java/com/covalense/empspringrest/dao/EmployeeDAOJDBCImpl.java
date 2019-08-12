package com.covalense.empspringrest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeOtherInfoBean;

public class EmployeeDAOJDBCImpl implements EmployeeDAO {
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select * from employee_info";
		try (Connection con = DriverManager.getConnection(dbUrl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				// bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setDob(rs.getDate("DOB"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NUMBER"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setPhone(rs.getInt("PHONE"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setEmail(rs.getString("EMAIL"));
				// bean.setManagerId(rs.getInt("MNGR_ID"));
				bean.setGender(rs.getString("Gender"));
				beans.add(bean);
			} // End of while
			return beans;
		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} // End of try-catch
	}// End of getAllEmployeeInfo

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbUrl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			String query = "select * from employee_info " + "where id=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			EmployeeInfoBean bean = new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setDesignation(rs.getString("DESIGNATION"));
				// bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setDob(rs.getDate("DOB"));
				bean.setAccountNumber(rs.getInt("ACCOUNT_NUMBER"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setPhone(rs.getInt("PHONE"));
				bean.setSalary(rs.getDouble("SALARY"));
				bean.setEmail(rs.getString("EMAIL"));
				// bean.setManagerId(rs.getInt("MNGR_ID"));
				bean.setGender(rs.getString("Gender"));

			} // End of while
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {

			{
				try {
					if (con != null) {
						con.close();
					}
					if (pstmt != null) {
						pstmt.close();
					}
					if (rs != null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfoBean(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeInfoBean> getAllEmpInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeOtherInfoBean getEmployeeOtherInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeOtherInfoBean getEmployeeOtherInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}// end of class
