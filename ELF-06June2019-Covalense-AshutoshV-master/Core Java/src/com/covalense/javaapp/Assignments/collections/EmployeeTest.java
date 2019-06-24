package com.covalense.javaapp.assgn.collections;

import java.util.ArrayList;


import lombok.extern.java.Log;

@Log
public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>(); 
		Employee s1 = new Employee();
		s1.id = 1234;
		s1.name="Prakash";
		s1.salary=25000;
		
		Employee s2 = new Employee();
		s2.id = 1235;
		s2.name="Kavita";
		s2.salary=64665;
		
		Employee s3 = new Employee();
		s3.id = 1236;
		s3.name="Ananya";
		s3.salary=79456;
		
		Employee s4 = new Employee();
		s4.id = 1237;
		s4.name="Kartik";
		s4.salary=7945;
		
		Employee s5 = new Employee();
		s5.id = 1238;
		s5.name="Shubhum";
		s5.salary=56756;
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		for (Employee e : al) {
		log.info("Name : "+e.name);
		log.info("Id : "+e.id);
		log.info("Salary : "+e.salary);
		}
	}

}
