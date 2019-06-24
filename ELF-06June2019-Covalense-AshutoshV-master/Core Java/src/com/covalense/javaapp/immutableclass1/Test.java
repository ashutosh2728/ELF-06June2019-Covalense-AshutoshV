package com.covalense.javaapp.immutableclass1;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) {
		Person p = new Person("Divya", 26);
		log.info("Name is " + p.getName());
		log.info("Age is " + p.getAge());

	}

}
