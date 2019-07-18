package com.covalense.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<String> ename = query.list();
		for (String empName : ename) {
			log.info("Name --- " + empName);
		}

		/*
		 * String hql = "Select name from EmployeeInfoBean"; // String hql =
		 * "from EmployeeInfoBean"; Query query = session.createQuery(hql);
		 * List<EmployeeInfoBean> employeeInfoBeans = query.list();
		 * 
		 * for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
		 * log.info("Name ===> " + employeeInfoBean.getName()); log.info("Id ===>" +
		 * employeeInfoBean.getId()); log.info("Age ===>" + employeeInfoBean.getAge());
		 * log.info("GENDER ===>" + employeeInfoBean.getGender());
		 * log.info("SALARY ===>" + employeeInfoBean.getSalary()); log.info("PHONE ===>"
		 * + employeeInfoBean.getPhone()); log.info("JOINING_DATE ===>" +
		 * employeeInfoBean.getJoiningDate()); log.info("ACCOUNT_NUMBER ===>" +
		 * employeeInfoBean.getAccountNumber()); log.info("EMAIL ===>" +
		 * employeeInfoBean.getEmail()); log.info("DESIGNATION ===>" +
		 * employeeInfoBean.getDesignation()); log.info("DOB ===>" +
		 * employeeInfoBean.getDob()); log.info("DEPT_ID ===>" +
		 * employeeInfoBean.getDepartmentId()); log.info("MNGR_ID ===>" +
		 * employeeInfoBean.getManagerId());
		 * 
		 * }
		 */

	}
}
