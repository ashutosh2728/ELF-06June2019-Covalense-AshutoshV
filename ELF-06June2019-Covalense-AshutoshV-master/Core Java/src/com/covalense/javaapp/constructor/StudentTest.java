package com.covalense.javaapp.constructor;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("Trisha", 24, 67.4);
		Student s1 = new Student("Priya", 28, 57.4);

		s.display();
		System.out.println("-----------------------");
		s1.display();
	}
}
