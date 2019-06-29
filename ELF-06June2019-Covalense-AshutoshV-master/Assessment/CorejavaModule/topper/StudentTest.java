package com.covalense.javaapp.topper;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class StudentTest {

	static Comparator<Student> c = (i, j) -> {
		if (i.gender == j.gender)
			if (i.percentage > j.percentage) {
				return 1;
			} else if (i.percentage < j.percentage) {
				return -1;
			}

		return 0;
	};
	static TreeSet<Student> ts = new TreeSet<Student>(c);

	static void getTopper(Student s) {
		if (s.gender == "Male") {
			log.info("Male topper is " + ts.stream().max(c));
		}
		if (s.gender == "Female") {
			log.info("Female Topper is " + ts.stream().max(c));
		}
	}

	public static void main(String[] args) {

		Student s1 = new Student("Ashutosh", "Male", 88);
		Student s2 = new Student("Punam", "Female", 78);
		Student s3 = new Student("Kavita", "Female", 68);
		Student s4 = new Student("Prakash", "Male", 58);
		Student s5 = new Student("Sonam", "Female", 89);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (Student s : ts) {
			log.info("Male topper is " + ts.stream().max(c));
			break;
		
		}

	}

}
