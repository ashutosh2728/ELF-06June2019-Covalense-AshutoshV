package com.covalense.javaapp.consumer;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class StudentTest {
public static void main(String[] args) {
	Student s1=new Student("Aman",80, 85, 65);
	Consumer<Student> c=s-> {
		double a=(s.marks1+s.marks2+s.marks3)/3.0;
		log.info(s.name+" secured "+a);
		
	};
	c.accept(s1);
}
}
