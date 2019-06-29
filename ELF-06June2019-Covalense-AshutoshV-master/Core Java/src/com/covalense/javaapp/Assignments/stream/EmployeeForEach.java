package com.covalense.javaapp.assgn.stream;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeeForEach {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee("Ashutosh", 1, "Software Engineer", 2);
		Employee e2 = new Employee("Rohit", 2, "Software Tester", 2.5);
		Employee e3 = new Employee("Aman", 3, "Support Engineer", 4);
		Employee e4 = new Employee("Reena", 4, "Software Engineer", 8);
		Employee e5 = new Employee("Jyoti", 5, "Software Tester", 1);
		Employee e6 = new Employee("Ansh", 6, "Software Engineer", 1.5);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);

		al.stream().forEach(i -> log.info("" + i));
	}

}
