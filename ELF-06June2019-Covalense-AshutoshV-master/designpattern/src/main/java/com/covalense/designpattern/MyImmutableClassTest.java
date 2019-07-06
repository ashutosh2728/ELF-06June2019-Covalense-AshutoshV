package com.covalense.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;
		immutableClass = new MyImmutableClass("Ashu", 24, 7721993516L);
		log.info("Name : " + immutableClass.getName());
		log.info("Age : " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());
		immutableClass = new MyImmutableClass("Ashutosh", 24, 7721993516L);
		log.info("Name : " + immutableClass.getName());
		log.info("Age : " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());
	}

}
