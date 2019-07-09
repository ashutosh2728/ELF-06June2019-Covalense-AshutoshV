package com.covalense.javaapp.objectcontent;

import java.util.ArrayList;

import com.covalense.javaapp.topper.Student;

import lombok.extern.java.Log;
@Log
public class Displaycontent {
public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	
	Student s1 =new Student("Ashutosh", "Male", 88);
	Student s2 =new Student("Punam", "Female", 78);
	Student s3 =new Student("Kavita", "Female", 68);
	Student s4 =new Student("Prakash", "Male", 58);
	Student s5 =new Student("Sonam", "Female", 89);
	


	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	
	al.stream().forEach(a-> log.info(""+a.toString()));
	
}
}
