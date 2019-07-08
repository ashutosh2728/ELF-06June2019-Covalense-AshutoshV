package com.covalense.designpattern;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.covalense.designpattern.beans.EmployeeInfoBean;
import com.covalense.designpattern.dao.EmployeeDAO;
import com.covalense.designpattern.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
public class DesignPatternsTest {
	public static void main(String[] args) throws Exception {
		// EmployeeDAO dao = new EmployeeDAOJDBCImpl();
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(108));
		printInfo(dao.getEmployeeInfo("102"));

		List<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
		for (EmployeeInfoBean bean : beans) {
			printInfo(bean);
		}

		// Create an Emmployee info
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = format.parse("1996-05-27");
		Date joiningDate = format.parse("2018-06-29");
		empInf.setId(150);
		empInf.setName("Aditya");
		empInf.setAge(28);
		empInf.setDepartmentId(20);
		empInf.setDesignation("Software Engineer");
		empInf.setDob(dob);
		empInf.setJoiningDate(joiningDate);
		empInf.setAccountNumber(636436663);
		empInf.setPhone(436363663);
		empInf.setSalary(465694);
		empInf.setEmail("aditya@gmail.com");
		empInf.setGender("Male");
		empInf.setManagerId(451);
		log.info("Inserted the employee info as " + dao.createEmployeeInfo(empInf));

		dao.deleteEmployeeInfoBean(6);
		dao.deleteEmployeeInfo("150");
	}// End of main

	private static void printInfo(EmployeeInfoBean bean) {
		log.info("Name ===> " + bean.getName());
		log.info("Id ===>" + bean.getId());
		log.info("Age ===>" + bean.getAge());
		log.info("GENDER ===>" + bean.getGender());
		log.info("SALARY ===>" + bean.getSalary());
		log.info("PHONE ===>" + bean.getPhone());
		log.info("JOINING_DATE ===>" + bean.getJoiningDate());
		log.info("ACCOUNT_NUMBER ===>" + bean.getAccountNumber());
		log.info("EMAIL ===>" + bean.getEmail());
		log.info("DESIGNATION ===>" + bean.getDesignation());
		log.info("DOB ===>" + bean.getDob());
		log.info("DEPT_ID ===>" + bean.getDepartmentId());
		log.info("MNGR_ID ===>" + bean.getManagerId());
	}

}
