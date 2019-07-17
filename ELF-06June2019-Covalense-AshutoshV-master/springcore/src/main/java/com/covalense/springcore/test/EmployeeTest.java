package com.covalense.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeBean employee1 = (EmployeeBean) applicationContext.getBean("employeeBean");
		// Scanner sc = new Scanner(System.in);
		// log.info("Enter id : ");
		// employee1.setId(sc.nextInt());
		// log.info("Enter name : ");
		// employee1.setName(sc.next());
		// log.info("Enter id : ");
		/*
		 * EmployeeBean employee2 = (EmployeeBean)
		 * applicationContext.getBean("employeeBean"); employee2.setId(sc.nextInt());
		 * log.info("Enter name : "); employee2.setName(sc.next());
		 */

		// EmployeeBean employee2 = (EmployeeBean)
		// applicationContext.getBean("departmentBean");
		log.info("" + employee1.getId());
		log.info("" + employee1.getName());
		/*
		 * log.info("" + employee2.getId()); log.info("" + employee2.getName());
		 */

		log.info("" + employee1.getDepartmentBean().getDeptId());
		log.info("" + employee1.getDepartmentBean().getDeptName());
		// log.info("" + employee1.getBean().getName());
		((AbstractApplicationContext) applicationContext).close();

	}
}
