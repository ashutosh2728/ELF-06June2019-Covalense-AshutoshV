package com.covalense.javaapp.objclass;

import lombok.extern.java.Log;

@Log
public class Test {
	public static void main(String[] args) {

		Student s = new Student("Ashutosh", 25, 5.6);
		Student p = new Student("Ashutosh", 25, 5.6);
		log.info("" + s.equals(p));

	}
}
