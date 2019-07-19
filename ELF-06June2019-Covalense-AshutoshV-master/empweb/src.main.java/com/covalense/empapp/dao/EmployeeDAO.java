package com.covalense.empapp.dao;

import java.util.List;

import com.covalense.empapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	List<EmployeeInfoBean> getAllEmployeeInfo(int id);

	List<EmployeeInfoBean> getAllEmployeeInfo(String id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfoBean(int id);

	boolean deleteEmployeeInfo(String id);

	List<EmployeeInfoBean> getAllEmpInfo(int id);

}
