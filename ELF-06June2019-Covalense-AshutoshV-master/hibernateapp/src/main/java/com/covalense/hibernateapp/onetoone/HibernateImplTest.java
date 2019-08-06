package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HibernateImplTest {
	public static void main(String[] args) {
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		Date joiningDate = null;
		try {
			dob = format.parse("1995-02-28");
			joiningDate = format.parse("2019-05-29");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		empInf.setId(2002);
		empInf.setName("Gangadhar");
		empInf.setAge(28);
		empInf.setDepartmentId(20);
		empInf.setDesignation("Software Engineer");
		empInf.setDob(dob);
		empInf.setJoiningDate(joiningDate);
		empInf.setAccountNumber(5956945);
		empInf.setPhone(4564636);
		empInf.setSalary(465694);
		empInf.setEmail("aditya@gmail.com");
		empInf.setGender("Male");
		empInf.setManagerId(451);

		EmployeeOtherInfoBean empOtherInf = new EmployeeOtherInfoBean();

		empOtherInf.setPan("ASVPV7200R");
		empOtherInf.setBloodGrp("AB-");
		// empOtherInf.setChallenged(false);
		// empOtherInf.setMarried(true);
		empOtherInf.setEmergencyContactName("Aakash");
		empOtherInf.setMotherName("Jaya");
		empOtherInf.setNationality("Indian");
		empOtherInf.setPassport("PWD297497");
		empOtherInf.setFatherName("Ramlal");
		empOtherInf.setRelegion("Hindu");
		empOtherInf.setSpouseName("Akansha" + "");
		empOtherInf.setAdhar(16362132);
		empOtherInf.setInfoBean(empInf);
		empInf.setEmployeeOtherInfoBean(empOtherInf);
		HibernateImpl hibernateImpl = new HibernateImpl();
		hibernateImpl.createEmployee(empInf);
	}
}
