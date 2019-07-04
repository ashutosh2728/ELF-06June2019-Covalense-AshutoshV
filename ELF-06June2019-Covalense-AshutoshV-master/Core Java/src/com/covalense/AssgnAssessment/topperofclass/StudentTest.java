package com.covalense.javaapp.assgn.assessment.topperofclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

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
		Comparator<Student> comparator = (i, j) -> {
			if (i.percentage > j.percentage) {
				return 1;
			} else if (i.percentage < j.percentage) {
				return -1;
			}

			return 0;
		};
		Predicate<Student> malePredicate = (i) -> i.gender.equals("Male");
		Predicate<Student> femalePredicate = (i) -> i.gender.equals("Female");
		log.info("Male topper is " + arrayList.stream().filter(malePredicate).max(comparator));
		log.info("Female topper is " + arrayList.stream().filter(femalePredicate).max(comparator));
	}
}
