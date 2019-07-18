package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class InsertRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "insert into EmployeeNewInfoBean(id , name , email) select id,name, email from EmployeeInfoBean where id =120";

		// query.setParameter("eid", 121);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			log.info("" + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
