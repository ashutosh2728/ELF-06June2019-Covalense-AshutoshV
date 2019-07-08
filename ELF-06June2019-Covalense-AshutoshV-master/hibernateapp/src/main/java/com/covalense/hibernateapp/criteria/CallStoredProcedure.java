package com.covalense.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class CallStoredProcedure {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("emp_info");
		List<Object[]> objects = query.getResultList();
		for (Object[] object : objects) {
			log.info("" + object[0]);
			log.info("" + object[1]);
			log.info("" + object[2]);
			log.info("" + object[3]);
			log.info("" + object[4]);
			log.info("" + object[5]);
			log.info("" + object[6]);
			log.info("" + object[7]);
			log.info("" + object[8]);
			log.info("" + object[9]);
			log.info("" + object[10]);
			log.info("" + object[11]);
			log.info("" + object[12]);
		}

	}
}
