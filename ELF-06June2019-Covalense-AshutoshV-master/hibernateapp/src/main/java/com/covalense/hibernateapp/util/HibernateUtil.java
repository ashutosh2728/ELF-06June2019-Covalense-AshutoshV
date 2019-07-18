package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class HibernateUtil {
	static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeOtherInfoBean.class).buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();

		}
		return sessionFactory;
	}

}
