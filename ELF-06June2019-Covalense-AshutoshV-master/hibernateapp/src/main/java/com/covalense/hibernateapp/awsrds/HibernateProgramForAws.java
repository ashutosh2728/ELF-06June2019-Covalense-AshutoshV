package com.covalense.hibernateapp.awsrds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateProgramForAws {
	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/hibernateapp/awsrds/hibernate.cache.aws.cfg.xml");
		cfg.addAnnotatedClass(NewEmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = format.parse("1996-05-27");
		Date joiningDate = format.parse("2018-06-29");
		NewEmployeeInfoBean bean = new NewEmployeeInfoBean();
		bean.setId(555);
		bean.setName("Ashutosh");
		bean.setAge(24);
		bean.setAccountNumber(26469636);
		bean.setDepartmentId(20);
		bean.setEmail("ashutosh.verma26@gmail.com");
		bean.setDob(dob);
		bean.setDob(joiningDate);
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bean);
		transaction.commit();
		session.close();

	}

}
