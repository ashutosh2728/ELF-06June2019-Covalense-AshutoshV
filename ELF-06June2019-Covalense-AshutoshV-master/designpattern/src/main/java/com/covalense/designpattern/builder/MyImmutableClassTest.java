package com.covalense.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) throws ParseException {
		MyImmutableClass immutableClass = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date date1 = sdf.parse("27-06-1996");
		EmployeeData employeeData = new EmployeeData(123, "Aashu", 24, "Male", 350000, 77219931, date1, 4456464,
				"ashu26@gmail.com", "Software Engineer", date1, 10, 400);

		log.info("" + employeeData.toString());

		immutableClass = new MyImmutableClass("Ashu", 24, 7721993516L);
		log.info("Name : " + immutableClass.getName());
		log.info("Age : " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());
		immutableClass = new MyImmutableClass("Ashutosh", 24, 7721993516L);
		log.info("Name : " + immutableClass.getName());
		log.info("Age : " + immutableClass.getAge());
		log.info("Phone : " + immutableClass.getPhone());

		EmployeeData2 data2 = new EmployeeData2.EmployeeData2Builder().id(128).name("Praditya").age(25).gender("Male")
				.dob(date1).accountNumber(46454541).designation("Electrical Engineer").email("praditya20100@gmail.com")
				.departmentId(30).managerId(500).joiningDate(date1).phone(91310465).salary(4343643).build();
		log.info("" + data2.toString());

		EmployeeData3 data3 = new EmployeeData3.EmployeeData3Builder().id(129).name("Praditya").age(25).gender("Male")
				.dob(date1).accountNumber(46454541).designation("Electrical Engineer").email("praditya20100@gmail.com")
				.departmentId(30).managerId(500).joiningDate(date1).phone(91310465).salary(4343643).build();
		log.info("" + data3.toString());
	}

}
