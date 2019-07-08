package com.covalense.assgnassessment.sortstudent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class StudentTest {
	  public static ArrayList<Student> arrayList = new ArrayList<Student>();
	public static void main(String[] args) {
		
		
		Student student1 = new Student("Akshay", 70, 1);
		Student student2 = new Student("Dhananjay", 76.8, 2);
		Student student3 = new Student("Aman", 66, 5);
		Student student4 = new Student("Rita", 88.5, 4);
		Student student5 = new Student("Sonia", 70.8, 3);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		arrayList.add(student5);
		
		List<Student> sortedByIdList =  arrayList.stream().sorted(SortByPercentage.comparator).collect(Collectors.toList());
		
		for (Student student : sortedByIdList) {
			log.info(student.toString());
		}
		
		
	}

}
