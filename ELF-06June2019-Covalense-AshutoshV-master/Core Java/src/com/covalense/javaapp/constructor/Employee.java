package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Employee {
	String name;
	int id;
	double salary;

	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	void display() {
		log.info("Name : "+name);
	}
}
