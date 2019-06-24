package com.covalense.javaapp.assgn.string;

public class TestStudent {
	public static void main(String[] args) {
		Student s[] = new Student[6];
		Student s1 = new Student();
		s1.setName("Ashu");
		s1.setPerc(89.3);
		s1.setRollNo(1);
		Student s2 = new Student();
		s2.setName("Aman");
		s2.setPerc(80.3);
		s2.setRollNo(2);
		Student s3 = new Student();
		s3.setName("Jatin");
		s3.setPerc(64.9);
		s3.setRollNo(3);
		Student s4 = new Student();
		s4.setName("Saurabh");
		s4.setPerc(78.3);
		s4.setRollNo(4);

		DB1 a = new DB1();
		DB2 b = new DB2();

		for (int i = 1; i < s.length - 1; i++) {
			a.display(s[i]);
			b.display(s[i]);
		}

	}
}
