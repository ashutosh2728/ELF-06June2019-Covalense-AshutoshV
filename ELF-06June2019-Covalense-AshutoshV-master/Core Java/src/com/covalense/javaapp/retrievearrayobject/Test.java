package com.covalense.javaapp.retrievearrayobject;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		Employee e1 = new Employee();
		e1.setAge(24);
		e1.setName("Pawan");
		e1.setSalary(45000);

		Employee e2 = new Employee();
		e2.setAge(25);
		e2.setName("Aman");
		e2.setSalary(25000);

		Employee e3 = new Employee();
		e3.setAge(26);
		e3.setName("Pari");
		e3.setSalary(65000);

		Employee e4 = new Employee();
		e4.setAge(24);
		e4.setName("Prakash");
		e4.setSalary(85000);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;

		Arrays.sort(emp);

		for (Employee e : emp) {
			log.info("Name is " + e.getName());
			log.info("Age is " + e.getAge());
			log.info("Salary is " + e.getSalary());
		}

	}

}
