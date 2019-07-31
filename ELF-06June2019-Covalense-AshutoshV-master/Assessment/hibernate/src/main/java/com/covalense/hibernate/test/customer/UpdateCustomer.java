package com.covalense.hibernate.test.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernate.dto.CustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

public class UpdateCustomer {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	CustomerBean bean = session.get(CustomerBean.class, 101);
	
	bean.setContactNumber(772199356);
	bean.setAddress("J.k. Electronics Main road Chandametta");
	bean.setCity("Chhindwara");
	

	Transaction transaction = null;
	try {
		session.saveOrUpdate(bean);
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
