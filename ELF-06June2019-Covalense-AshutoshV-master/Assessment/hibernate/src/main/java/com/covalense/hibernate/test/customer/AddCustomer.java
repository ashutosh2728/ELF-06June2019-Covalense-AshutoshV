package com.covalense.hibernate.test.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.dto.CustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

public class AddCustomer {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		CustomerBean bean = new CustomerBean();
		bean.setId(101);
		bean.setFirstName("Ashutosh");
		bean.setLastName("Verma");
		bean.setContactNumber(772199356);
		bean.setAddress("J.k. Electronics");
		bean.setCity("Chhindwara");
		bean.setState("MP");
		bean.setCountry("India");

		Transaction transaction = null;
		try {
			session.save(bean);
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
