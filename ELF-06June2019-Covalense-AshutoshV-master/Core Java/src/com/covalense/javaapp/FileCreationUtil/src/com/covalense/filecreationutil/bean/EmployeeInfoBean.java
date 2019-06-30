package com.covalense.filecreationutil.bean;

import java.sql.Date;


import lombok.Data;

@Data
public class EmployeeInfoBean {
	private int id;
	private String name;
	private String email;
	private long phone;
	private Date joiningDate;
	private double Salary;
}
