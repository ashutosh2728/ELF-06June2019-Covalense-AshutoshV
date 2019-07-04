package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class DeleteRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empthe = session.get(EmployeeInfoBean.class, 121);
		empthe.getId();
		Transaction transaction = session.beginTransaction();
		session.delete(empthe);
		transaction.commit();
		session.close();
	}
}
