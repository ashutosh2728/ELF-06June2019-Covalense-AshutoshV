package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetail {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> employeeInfoBeans = criteria.list();
		for (EmployeeInfoBean employeeInfoBean : employeeInfoBeans) {
			log.info("Name ===> " + employeeInfoBean.getName());
			log.info("Id ===>" + employeeInfoBean.getId());
			log.info("Age ===>" + employeeInfoBean.getAge());
			log.info("GENDER ===>" + employeeInfoBean.getGender());
			log.info("SALARY ===>" + employeeInfoBean.getSalary());
			log.info("PHONE ===>" + employeeInfoBean.getPhone());
			log.info("JOINING_DATE ===>" + employeeInfoBean.getJoiningDate());
			log.info("ACCOUNT_NUMBER ===>" + employeeInfoBean.getAccountNumber());
			log.info("EMAIL ===>" + employeeInfoBean.getEmail());
			log.info("DESIGNATION ===>" + employeeInfoBean.getDesignation());
			log.info("DOB ===>" + employeeInfoBean.getDob());
			log.info("DEPT_ID ===>" + employeeInfoBean.getDepartmentId());
			log.info("MNGR_ID ===>" + employeeInfoBean.getManagerId());
		}
	}
}
