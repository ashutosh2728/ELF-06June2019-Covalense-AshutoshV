package com.covalense.javaapp.copy.javabean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean2 {
	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joiningDate;
	private String gender;

}// End of class
