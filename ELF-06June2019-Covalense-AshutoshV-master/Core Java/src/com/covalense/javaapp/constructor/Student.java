package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;
	int age;
	double perc;

	Student(String name, int age, double perc) {
		this.name = name;
		this.age = age;
		this.perc = perc;
	}

	void display() {
		log.info("Name : "+name);
		log.info("Age : "+age);
		log.info("Percentage : "+perc);
	}

}
