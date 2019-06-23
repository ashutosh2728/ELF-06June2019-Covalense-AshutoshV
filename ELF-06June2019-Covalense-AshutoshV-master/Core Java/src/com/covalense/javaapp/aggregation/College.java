package com.covalense.javaapp.aggregation;

import lombok.extern.java.Log;

@Log
public class College {
	final static Student s = new Student();
	void teach() {
		log.info("Teach Method");
	}

	
}

