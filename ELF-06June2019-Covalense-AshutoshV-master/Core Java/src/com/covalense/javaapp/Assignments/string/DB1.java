package com.covalense.javaapp.assgn.string;

import lombok.extern.java.Log;

@Log
public class DB1 {
	void display(Student s) {
		log.info("Name : " + s.getName());
		log.info("Roll No : " + s.getRollNo());
		log.info("Percentage : " + s.getPerc());
	}
}
