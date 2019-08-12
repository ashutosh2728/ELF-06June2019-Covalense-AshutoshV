package com.covalense.empspringrest.dao;

import java.util.List;

import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeOtherInfoBean;

public interface EmployeeDAO {
	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	EmployeeOtherInfoBean getEmployeeOtherInfo(int id);

	EmployeeOtherInfoBean getEmployeeOtherInfo(String id);

	List<EmployeeInfoBean> getAllEmployeeInfo(int id);

	List<EmployeeInfoBean> getAllEmployeeInfo(String id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfoBean(int id);

	boolean deleteEmployeeInfo(String id);

	List<EmployeeInfoBean> getAllEmpInfo(int id);

}
