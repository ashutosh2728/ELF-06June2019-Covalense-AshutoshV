package com.covalense.javaapp.implementinglamda;

import lombok.Getter;

@Getter
public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}
