package com.covalense.hibernateapp.manytoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateImpl {
	private Configuration configuration = new Configuration();
	private SessionFactory factory = configuration.configure().buildSessionFactory();

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBeanList, List<EmployeeEducationalInfoBean> educationInfoBeanList,
			List<EmployeeExperienceInfoBean> experienceInfoBeanList) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		session.save(otherInfoBean);

		for (EmployeeAddressInfoBean addressInfoBean : addressInfoBeanList) {
			session.save(addressInfoBean);
		}

		for (EmployeeEducationalInfoBean employeeEducationalInfoBean : educationInfoBeanList) {
			session.save(employeeEducationalInfoBean);
		}
		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : experienceInfoBeanList) {
			session.save(employeeExperienceInfoBean);
		}
		transaction.commit();
		session.close();
	}
}
