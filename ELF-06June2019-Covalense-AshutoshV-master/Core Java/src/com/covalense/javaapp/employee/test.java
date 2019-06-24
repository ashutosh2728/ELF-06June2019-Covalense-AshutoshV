package com.covalense.javaapp.immutableclass.employee;

import lombok.extern.java.Log;

@Log
public class test {
	public static void main(String[] args) {

		Employee e = new Employee("Aman", 23, 7, 'M', true);
		log.info("Name : " + e.getName());
		log.info("Age : " + e.getAge());
		log.info("Gender : " + e.getGender());
		log.info("Height : " + e.getHeight());
		log.info("Status : " + e.isStatus());
	}

}
