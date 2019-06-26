package com.covalense.javapp.employeedata;

import lombok.extern.java.Log;

@Log
public class EDB1 {

	void edb1(Employee e) {
		log.info("Name is " + e.getName());
		log.info("Salary is " + e.getGender());
		log.info("Gender is " + e.getSalary());
	}

}
