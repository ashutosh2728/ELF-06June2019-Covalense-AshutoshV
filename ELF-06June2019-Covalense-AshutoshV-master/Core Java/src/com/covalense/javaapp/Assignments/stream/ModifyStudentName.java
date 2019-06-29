package com.covalense.javaapp.assgn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ModifyStudentName {
	public static void main(String[] args) {
		ArrayList<StudentToModify> al = new ArrayList<StudentToModify>();
		StudentToModify s1 = new StudentToModify("Prem", 1, "Male");
		StudentToModify s2 = new StudentToModify("Aman", 2, "Male");
		StudentToModify s3 = new StudentToModify("Prema", 3, "Female");
		StudentToModify s4 = new StudentToModify("Priya", 4, "Female");

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Predicate<StudentToModify> p = (i) -> i.gender == "Male";
		List<StudentToModify> l = al.stream().filter(p).collect(Collectors.toList());
		for (StudentToModify s : l) {

		}
	}

}
