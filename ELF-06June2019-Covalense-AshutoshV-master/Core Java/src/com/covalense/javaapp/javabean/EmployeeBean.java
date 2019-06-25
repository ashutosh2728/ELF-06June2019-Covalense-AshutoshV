package com.covalense.javaapp.copy.javabean;

import java.util.Date;

public class EmployeeBean {
	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private Date joiningDate;
	private String gender;

	public EmployeeBean() {

	}

	public EmployeeBean(int id, String name, String department, double salary, int age, Date joiningDate,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.joiningDate = joiningDate;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", age=" + age + ", joiningDate=" + joiningDate + ", gender=" + gender + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
