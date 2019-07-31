package com.covalense.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernate.dto.CustomerBean;
import com.covalense.hibernate.dto.ProductsBean;
import com.covalense.hibernate.dto.StudentBean;
import com.covalense.hibernate.dto.StudentInfoBean;
import com.covalense.hibernate.dto.StudentOtherInfoBean;
import com.covalense.hibernate.dto.TestBean;

public class HibernateUtil {

	private HibernateUtil() {

	}

	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(CustomerBean.class).addAnnotatedClass(StudentInfoBean.class).addAnnotatedClass(StudentBean.class).addAnnotatedClass(StudentOtherInfoBean.class).addAnnotatedClass(TestBean.class).buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			return buildSessionFactory();
		} else {
			return sessionFactory;
		}
	}

}
