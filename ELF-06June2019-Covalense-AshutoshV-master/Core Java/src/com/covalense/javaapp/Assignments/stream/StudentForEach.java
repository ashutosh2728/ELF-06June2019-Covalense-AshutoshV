package com.covalense.javaapp.assgn.stream;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class StudentForEach {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student(1, "Amar", 18);
		Student s2 = new Student(2, "Akash", 19);
		Student s3 = new Student(3, "Reena", 18);
		Student s4 = new Student(4, "Diya", 20);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		al.stream().forEach(i -> log.info("" + i));
	}

}
