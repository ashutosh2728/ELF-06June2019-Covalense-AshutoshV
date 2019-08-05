package com.covalense.hibernateapp.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateImpl {
	private Configuration configuration = new Configuration();
	private SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);
		transaction.commit();
		session.close();
	}
}
