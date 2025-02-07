package com.covalense.employeeapp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "employee_info")
@Entity
@Data
public class EmployeeInfoBean implements Serializable {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "gender")
	private String gender;
	@Column(name = "salary")
	private double salary;
	@Column(name = "phone")
	private int phone;
	@Column(name = "joining_date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private int accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "dept_id")
	private int departmentId;
	@Column(name = "mngr_Id")
	private int managerId;

}
