package com.covalense.designpattern.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpattern.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		// 1. Load the config file
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EmployeeInfoBean.class);

		// 2. Build the sessionFactory
		SessionFactory factory = cfg.buildSessionFactory();

		// 3. Open Session
		Session session = factory.openSession();

		// 4. Interact with db via Session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);

		// 5. Close Session
		session.close();
		return bean;
	}

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		// TODO
		return null;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfoBean(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
