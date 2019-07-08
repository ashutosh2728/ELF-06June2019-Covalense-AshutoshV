package com.covalense.assgnassessment.immutableclass;

import lombok.extern.java.Log;

@Log
public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("Ashutosh", 24,"Male");
		log.info("Name : "+person.getName());
		log.info("Age : "+person.getAge());
		log.info("Gender : "+person.getGender());
		Person person1 = new Person("Ashutosh", 25,"Male");
		log.info("Name : "+person.getName());
		log.info("Age : "+person.getAge());
		log.info("Gender : "+person.getGender());
	}

}
