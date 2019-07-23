package com.covalense.employeeapp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.employeeapp.beans.EmployeeInfoBean;
import com.covalense.employeeapp.config.HibernateConfig;

import lombok.extern.java.Log;

@Log
public class GetEmployeeInfo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, 103);

		log.info("Name : " + infoBean.getName());
		log.info("ID  " + infoBean.getId());
		log.info("Account Number : " + infoBean.getAccountNumber());
		log.info("Salary : " + infoBean.getSalary());
		log.info("Age : " + infoBean.getAge());
		log.info("Department Id : " + infoBean.getDepartmentId());
		log.info("Designation : " + infoBean.getDesignation());
		log.info("Gender : " + infoBean.getGender());
		log.info("Phone : " + infoBean.getPhone());
		log.info("Manager Id : " + infoBean.getManagerId());
		log.info("Email : " + infoBean.getEmail());
		log.info("JoiningDate : " + infoBean.getJoiningDate());
		log.info("DOB : " + infoBean.getDob());

		session.close();
	}

}
