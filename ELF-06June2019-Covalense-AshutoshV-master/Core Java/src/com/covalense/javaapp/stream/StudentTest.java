package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	static Comparator<Student> c = (a, b) -> {
		if (a.perc > b.perc) {
			return 1;
		} else if (a.perc < b.perc) {
			return -1;
		}
		return 0;
	};

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Aman";
		s1.perc = 80.5;

		Student s2 = new Student();
		s2.id = 2;
		s2.name = "Aryan";
		s2.perc = 70.5;

		Student s3 = new Student();
		s3.id = 1;
		s3.name = "Prakash";
		s3.perc = 60.8;

		Student s4 = new Student();
		s4.id = 4;
		s4.name = "Yash";
		s4.perc = 76;

		Student s5 = new Student();
		s5.id = 5;
		s5.name = "Akash";
		s5.perc = 85;
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Student s = getTopper(al);
		log.info("Topper is " + s.name + " with percentage " + s.perc);

		Student l = getLoser(al);
		log.info("Loser is " + l.name + " with percentage " + l.perc);

	}

	static Student getTopper(ArrayList<Student> al) {
		return al.stream().max(c).get();
	};

	static Student getLoser(ArrayList<Student> al) {
		return al.stream().min(c).get();
	};
}
