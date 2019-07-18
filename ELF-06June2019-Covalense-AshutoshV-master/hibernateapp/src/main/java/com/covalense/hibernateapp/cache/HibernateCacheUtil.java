package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCacheUtil {

	private static SessionFactory sessionFactory;

	private HibernateCacheUtil() {

	}

	public static Session openSession() {

		return buildSessionFactory().openSession();

	}

	public static SessionFactory buildSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml")
					.addAnnotatedClass(EmployeeNewInfoBean.class).buildSessionFactory();
		}
		return sessionFactory;

	}
}
