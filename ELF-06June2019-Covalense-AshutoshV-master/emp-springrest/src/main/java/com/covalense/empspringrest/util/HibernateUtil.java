package com.covalense.empspringrest.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HibernateUtil {
	@Autowired
	private SessionFactory sessionFactory;

	public Session openSession() {
		return sessionFactory.openSession();
	}

}
