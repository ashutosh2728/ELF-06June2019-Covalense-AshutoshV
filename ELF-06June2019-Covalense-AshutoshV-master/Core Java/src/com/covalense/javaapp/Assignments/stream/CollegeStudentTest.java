package com.covalense.javaapp.assgn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class CollegeStudentTest {
	public static void main(String[] args) {
		ArrayList<CollegeStudent> al = new ArrayList<CollegeStudent>();
		CollegeStudent s1 = new CollegeStudent("Arya", 1, 65);
		CollegeStudent s2 = new CollegeStudent("Aman", 2, 78);
		CollegeStudent s3 = new CollegeStudent("Jatin", 3, 85);
		CollegeStudent s4 = new CollegeStudent("Pawan", 4, 95);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Predicate<CollegeStudent> p = i -> i.perc > 75;

		List<CollegeStudent> y = al.stream().filter(p).collect(Collectors.toList());
		log.info("" + y);

	}

}
