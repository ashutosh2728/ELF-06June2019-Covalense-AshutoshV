package com.covalense.hibernate.test.studentonetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.dto.StudentInfoBean;
import com.covalense.hibernate.dto.StudentOtherInfoBean;
import com.covalense.hibernate.util.HibernateUtil;

public class StudentTest {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	StudentInfoBean infoBean = new StudentInfoBean();
	StudentOtherInfoBean otherInfoBean = new StudentOtherInfoBean();
	infoBean.setRollNum(103);
	infoBean.setName("Pawan");
	infoBean.setGender("Male");
	infoBean.setEmailId("pawan@gmail.com");
	infoBean.setMobileNo(14696466);
	infoBean.setAge(19);
	otherInfoBean.setFatherName("Babulal");
	otherInfoBean.setMotherName("Babita");
	otherInfoBean.setNationality("Indian");
	otherInfoBean.setRelegion("hindu");
	otherInfoBean.setRollNum(101);
	infoBean.setOtherInfoBean(otherInfoBean);
	
	Transaction transaction = null;
	try {
	session.save(infoBean);
		transaction = session.beginTransaction();
		transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		transaction.rollback();
	} finally {
		session.close();
	}
}
}
