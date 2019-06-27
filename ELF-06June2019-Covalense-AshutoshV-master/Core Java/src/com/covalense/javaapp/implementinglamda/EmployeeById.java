package com.covalense.javaapp.implementinglamda;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		}
		return 0;
	}
}
