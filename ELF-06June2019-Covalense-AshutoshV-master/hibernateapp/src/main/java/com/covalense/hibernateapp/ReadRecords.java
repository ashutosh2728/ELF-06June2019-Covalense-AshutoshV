package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean empthe = session.get(EmployeeInfoBean.class, 101);
		log.info("" + empthe.getId());
		log.info("" + empthe.getAccountNumber());
		log.info("" + empthe.getDeptId());
		log.info("" + empthe.getGender());

		session.close();
	}
}
