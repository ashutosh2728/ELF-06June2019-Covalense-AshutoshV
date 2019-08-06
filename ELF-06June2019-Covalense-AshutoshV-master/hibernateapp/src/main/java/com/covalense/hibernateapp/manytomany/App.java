package com.covalense.hibernateapp.manytomany;

import com.covalense.hibernateapp.manytoone.EmployeeInfoBean;

public class App {
	public static void main(String[] args) {
		HibernateImpl2 impl = new HibernateImpl2();
		EmployeeInfoBean bean = impl.getEmployeeInfoBean(136565);
		EmployeeInfoBean bean1 = impl.getEmployeeInfoBean(108);
		EmployeeInfoBean bean2 = impl.getEmployeeInfoBean(109);

		impl.createEmployee(bean1);
		impl.createEmployee(bean2);
		// bean1.setMngId(bean);
		// bean2.setMngId(bean);
	}

}
