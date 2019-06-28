package com.covalense.javaapp.immutableclass.employee;

import lombok.Getter;
import lombok.Setter;

@Getter
public final class Employee {
	private final String name;
	private final int age;
	private final double height;
	private final char gender;
	private final boolean status;

	public Employee(String name, int age, double height, char gender, boolean status) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.status = status;
	}


}
