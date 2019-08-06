package com.covalense.hibernateapp.manytomany;

import java.text.ParseException;
import java.util.Arrays;

import com.covalense.hibernateapp.manytoone.EmployeeInfoBean;

public class HibernateImplTest {
	public static void main(String[] args) throws ParseException {
		HibernateImpl hibernateImpl = new HibernateImpl();
		EmployeeInfoBean empInf = hibernateImpl.getEmployeeInfoBean(103);
		EmployeeInfoBean empInf2 = hibernateImpl.getEmployeeInfoBean(102);

		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(1010);
		trainingInfoBean.setCourseName("JAVA");
		trainingInfoBean.setCourseType("Software");
		trainingInfoBean.setDuration("150");
		trainingInfoBean.setEmployeeInfoBeans(Arrays.asList(empInf, empInf2));
		hibernateImpl.createTraining(trainingInfoBean);

	}

}
