package com.covalense.mywebapp.dao;

import java.util.List;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	List<EmployeeInfoBean> getAllEmployeeInfo();

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfoBean(int id);

	boolean deleteEmployeeInfo(String id);
}
