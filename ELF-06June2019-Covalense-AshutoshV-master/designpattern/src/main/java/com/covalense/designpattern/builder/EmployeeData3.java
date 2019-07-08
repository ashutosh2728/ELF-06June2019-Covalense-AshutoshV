package com.covalense.designpattern.builder;

import java.util.Date;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public final class EmployeeData3 {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private int phone;
	private Date joiningDate;
	private int accountNumber;
	private String email;
	private String designation;
	private Date dob;
	private int departmentId;
	private int managerId;

}
