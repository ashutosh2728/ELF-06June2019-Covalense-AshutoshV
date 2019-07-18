package com.covalense.hibernateapp.cache;

import org.hibernate.Session;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest2 {
	public static void main(String[] args) {
		log.info("1rst time" + getEmployeeData(120).toString());
		log.info("2nd time" + getEmployeeData(120).toString());
		log.info("3rd time" + getEmployeeData(120).toString());

	}// End of main

	private static EmployeeNewInfoBean getEmployeeData(int id) {

		EmployeeNewInfoBean bean;
		try (Session session = HibernateCacheUtil.openSession();) {
			bean = session.get(EmployeeNewInfoBean.class, id);
		}
		return bean;
	}
}// End of class