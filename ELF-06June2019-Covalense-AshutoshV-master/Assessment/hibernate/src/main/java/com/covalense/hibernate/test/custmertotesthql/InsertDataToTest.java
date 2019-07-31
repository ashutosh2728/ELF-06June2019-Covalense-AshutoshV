package com.covalense.hibernate.test.custmertotesthql;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertDataToTest {
public static void main(String[] args) {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	String query = "insert into TestBean(id,firstName,lastName,city) Select(id,firstName,lastName,city) from CustomerBean";
	Query query2 = session.createQuery(query);
	int res = query2.executeUpdate();
	log.info("Query Executed"+res);
}
}
