package com.covalense.javaapp.assgn.collections;

import java.util.ArrayList;
import lombok.extern.java.Log;

@Log
public class StudentTest  {
public static void main(String[] args) {
	ArrayList<StudentA> al = new ArrayList<StudentA>();
		 
	 StudentA s1 = new StudentA();
	 s1.setId(1);
	 s1.setName("Akash");
	 s1.setPercentage(69.58);
	 
	 StudentA s2 = new StudentA();
	 s2.setId(1);
	 s2.setName("Akash");
	 s2.setPercentage(69.58);
	 
	 StudentA s3 = new StudentA();
	 s3.setId(1);
	 s3.setName("Akash");
	 s3.setPercentage(69.58);
	 
	 StudentA s4 = new StudentA();
	 s4.setId(1);
	 s4.setName("Akash");
	 s4.setPercentage(69.58);
	 
	 StudentA s5 = new StudentA();
	 s5.setId(1);
	 s5.setName("Akash");
	 s5.setPercentage(69.58);
	 
	 al.add(s1);
	 al.add(s2);
	 al.add(s3);
	 al.add(s4);
	 al.add(s5);
	 
	 for(StudentA s : al) {
		log.info(" Name : "+s.getName());
		log.info(" Id : "+s.getId());
		log.info(" Percentage : "+s.getPercentage());
	 }
	
	
	
	
}
}
