package com.covalense.hibernate.test.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.dto.StudentBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	private static Session session;
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 session = sessionFactory.openSession();
		 log.info(""+getStudentData(101));
		 log.info(""+getStudentData(101));
		 log.info(""+getStudentData(101));
		 
	}
	
	
	public static StudentBean getStudentData(int id) {
		StudentBean bean = session.get(StudentBean.class, id);
		return bean;
	}

}
