package com.covalense.hibernateapp.manytomany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HibernateImplTest {
	public static void main(String[] args) throws ParseException {
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = format.parse("1996-05-27");
		Date joiningDate = format.parse("2018-06-29");
		empInf.setId(7177);
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
		empInf.setMngrId(101);

		EmployeeInfoBean empInf2 = new EmployeeInfoBean();

		empInf2.setId(7347);
		empInf2.setName("Aditya");
		empInf2.setAge(28);
		empInf2.setDepartmentId(20);
		empInf2.setDesignation("Software Engineer");
		empInf2.setDob(dob);
		empInf2.setJoiningDate(joiningDate);
		empInf2.setAccountNumber(636436663);
		empInf2.setPhone(436363663);
		empInf2.setSalary(465694);
		empInf2.setEmail("aditya@gmail.com");
		empInf2.setGender("Male");
		empInf2.setMngrId(101);

		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(101);
		trainingInfoBean.setCourseName("JAVA");
		trainingInfoBean.setCourseType("Software");
		trainingInfoBean.setDuration("150");
		trainingInfoBean.setEmployeeInfoBeans(Arrays.asList(empInf, empInf2));

		HibernateImpl hibernateImpl = new HibernateImpl();
		hibernateImpl.createTraining(trainingInfoBean);

	}

}
