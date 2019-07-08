package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInfoBean.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeNewInfoBean bean1 = session.get(EmployeeNewInfoBean.class, 120);
		log.info("First " + bean1.toString());
		EmployeeNewInfoBean bean2 = session.get(EmployeeNewInfoBean.class, 120);
		log.info("Second " + bean2.toString());
		EmployeeNewInfoBean bean3 = session.get(EmployeeNewInfoBean.class, 120);
		log.info("Third " + bean3.toString());

		session.close();

	}// End of main
}// End of class
