package com.covalense.javaapp.assgn.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class SortByIdStream {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(1, "Arya", 15);
		Student s2 = new Student(2, "Aman", 17);
		Student s3 = new Student(3, "Jatin", 17);
		Student s4 = new Student(4, "Pawan", 16);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Comparator<Student> c = (i, j) -> {
			if (i.id > j.id) {
				return 1;
			} else if (i.id < j.id) {
				return -1;
			}
			return 0;
		};

		List<Student> l = al.stream().sorted(c).collect(Collectors.toList());
		log.info("" + l);

	}

}
