package com.covalense.javaapp.assgn.assessment.passedfemalecount;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student student1 = new Student("Ashutosh", "Male", 88);
		Student student2 = new Student("Punam", "Female", 78);
		Student student3 = new Student("Kavita", "Female", 68);
		Student student4 = new Student("Prakash", "Male", 58);
		Student student5 = new Student("Sonam", "Female", 89);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);

		Predicate<Student> predicate = (i) -> i.percentage > 35 && i.gender == "Female";
		List<Student> list = arrayList.stream().filter(predicate).collect(Collectors.toList());
		for (Student student : list) {
			log.info("" + student);
		}

	}

}
