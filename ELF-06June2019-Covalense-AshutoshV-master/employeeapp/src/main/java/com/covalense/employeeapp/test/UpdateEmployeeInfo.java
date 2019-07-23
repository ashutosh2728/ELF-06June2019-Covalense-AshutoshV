package com.covalense.employeeapp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.employeeapp.beans.EmployeeInfoBean;
import com.covalense.employeeapp.config.HibernateConfig;

public class UpdateEmployeeInfo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);

		Session session = factory.openSession();
		EmployeeInfoBean employeeInfoBean = session.get(EmployeeInfoBean.class, 102);
		employeeInfoBean.setSalary(123456);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(employeeInfoBean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

}
