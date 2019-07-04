package com.covalense.xmlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlmapping.dto.DepartmentInfoBean;

public class SaveRecord {
	public static void main(String[] args) {
		DepartmentInfoBean deptInfo = new DepartmentInfoBean();
		deptInfo.setDeptId(50);
		deptInfo.setDeptName("Marketing");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(deptInfo);
		trans.commit();
		session.close();

	}
}
