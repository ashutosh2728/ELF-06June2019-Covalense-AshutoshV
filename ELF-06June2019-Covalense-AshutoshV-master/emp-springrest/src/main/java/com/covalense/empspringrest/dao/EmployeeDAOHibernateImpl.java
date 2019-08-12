package com.covalense.empspringrest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.empspringrest.dto.EmployeeInfoBean;
import com.covalense.empspringrest.dto.EmployeeOtherInfoBean;
import com.covalense.empspringrest.util.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		EmployeeInfoBean bean = null;
		try (Session session = hibernateUtil.openSession();) {
			bean = session.get(EmployeeInfoBean.class, id);
		}
		return bean;
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {

		Transaction txn = null;
		try (Session session = hibernateUtil.openSession();) {
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo(int id) {
		Session session = hibernateUtil.openSession();
		String hql = "from EmployeeInfoBean ";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();

		return employeeInfoBeans;
	}

	@Override
	public List<EmployeeInfoBean> getAllEmpInfo(int id) {
		Session session = hibernateUtil.openSession();
		String hql = "from EmployeeInfoBean where str(id) like " + "'" + id + "%" + "'";
		Query query = session.createQuery(hql);
		List<EmployeeInfoBean> employeeInfoBeans = query.list();

		return employeeInfoBeans;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfoBean(int id) {
		Transaction txn = null;
		try {
			EmployeeInfoBean bean = new EmployeeInfoBean();
			bean.setId(id);
			Session session = hibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfoBean(Integer.parseInt(id));
	}

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo(String id) {
		return getAllEmpInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeOtherInfoBean getEmployeeOtherInfo(int id) {
		EmployeeOtherInfoBean bean = null;
		try (Session session = hibernateUtil.openSession();) {
			bean = session.get(EmployeeOtherInfoBean.class, id);
		}
		return bean;
	}

	@Override
	public EmployeeOtherInfoBean getEmployeeOtherInfo(String id) {
		return getEmployeeOtherInfo(Integer.parseInt(id));
	}

}
