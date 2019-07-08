package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	public static void main(String[] args) {
		log.info("1rst time" + getEmployeeData(120).toString());
		log.info("2nd time" + getEmployeeData(120).toString());
		log.info("3rd time" + getEmployeeData(120).toString());

	}// End of main

	private static EmployeeNewInfoBean getEmployeeData(int id) {
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInfoBean.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeNewInfoBean bean = session.get(EmployeeNewInfoBean.class, id);
		// log.info("First " + bean1.toString());

		session.close();
		return bean;
	}
}// End of class