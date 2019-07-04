package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class EmpOtherSaveDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// cfg.addAnnotatedClass(EmployeeOtherInfoBean.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		EmployeeOtherInfoBean otherEmpInfo = new EmployeeOtherInfoBean();
		otherEmpInfo.setId(153);
		otherEmpInfo.setAdhar(23784656);
		otherEmpInfo.setBloodGrp("B-");
		otherEmpInfo.setChallenged(false);
		otherEmpInfo.setEmergencyContactName("Aksahay");
		otherEmpInfo.setEmergencyContactNum(564646964);
		otherEmpInfo.setMarried(false);
		otherEmpInfo.setNationality("Indian");
		otherEmpInfo.setFatherName("Babulal");
		otherEmpInfo.setMotherName("Kavita");
		otherEmpInfo.setPan("ASVJJ85614");
		otherEmpInfo.setPassport("HIJJK45566");
		otherEmpInfo.setRelegion("Hindu");
		otherEmpInfo.setSpouseName("");

		session.save(otherEmpInfo);
		transaction.commit();
		session.close();
	}

}
