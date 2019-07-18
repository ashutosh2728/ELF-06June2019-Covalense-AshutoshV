package com.covalense.hibernateapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDataUtil {

	private PrepareDataUtil() {

	}

	public static EmployeeInfoBean prepareData(int id) {
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		Date joiningDate = null;
		try {
			dob = format.parse("1996-05-27");
			joiningDate = format.parse("2018-06-29");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empInf.setId(id);
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

		EmployeeOtherInfoBean empOtherInf = new EmployeeOtherInfoBean();
		empOtherInf.setPan("ASVPV7200P");
		empOtherInf.setBloodGrp("B-");
		empOtherInf.setChallenged(false);
		empOtherInf.setMarried(false);
		empOtherInf.setEmergencyContactName("Pawan");
		empOtherInf.setMotherName("Jaya");
		empOtherInf.setNationality("Indian");
		empOtherInf.setPassport("PWD297497");
		empOtherInf.setFatherName("Deviprasad");
		empOtherInf.setRelegion("Hindu");
		empOtherInf.setSpouseName("");
		empOtherInf.setAdhar(16362132);
		empInf.setOtherInfo(empOtherInf);
		return empInf;
	}
}
