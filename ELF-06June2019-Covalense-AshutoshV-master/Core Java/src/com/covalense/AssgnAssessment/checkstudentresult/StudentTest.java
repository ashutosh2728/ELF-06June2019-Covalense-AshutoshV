package com.covalense.assgnassessment.checkstudentresult;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	public static void main(String[] args) {
		
		Predicate<Student> predicate = (i)-> i.getPercentage()>=60;
		Student student1 = new Student("Akshay", 70, "A01");
		Student student2 = new Student("Dhananjay", 50, "A08");
		log.info(""+predicate.test(student1));
		log.info(""+predicate.test(student2));
	}

}
