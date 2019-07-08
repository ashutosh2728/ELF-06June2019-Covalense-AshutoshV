package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.util.HibernateUtil;

public class SaveRecords {
	public static void main(String[] args) throws ParseException {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		EmployeeInfoBean empInf = new EmployeeInfoBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = format.parse("1996-05-27");
		Date joiningDate = format.parse("2018-06-29");
		empInf.setId(6);
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
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(empInf);
		transaction.commit();
		session.close();
	}

}
