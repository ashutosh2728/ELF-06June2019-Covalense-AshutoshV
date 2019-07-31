package com.covalense.hibernate.test.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernate.dto.CustomerBean;
import com.covalense.hibernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetCustomer {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		CustomerBean customerBean = session.get(CustomerBean.class, 101);
		log.info("ID : "+customerBean.getId());
		log.info("First Name : "+customerBean.getFirstName());
		log.info("Last Name : "+customerBean.getLastName());
		log.info("Contact Number : "+customerBean.getContactNumber());
		log.info("Address : "+customerBean.getAddress());
		log.info("City : "+customerBean.getCity());
		log.info("State : "+customerBean.getState());
		log.info("Country : "+customerBean.getCountry());
	}

}
