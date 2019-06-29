package com.covalense.javaapp.assgn.stream;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class StudentSort {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Amar", 18);
		Student s2 = new Student(2, "Akash", 19);
		Student s3 = new Student(3, "Reena", 18);
		Student s4 = new Student(4, "Diya", 20);
		Comparator<Student> c = (i, j) -> i.name.compareTo(j.name);
		TreeSet<Student> t = new TreeSet<Student>(c);
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);

		for (Student s : t) {
			log.info("" + s);
		}
	}
}
