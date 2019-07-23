package com.covalense.employeeapp.beans;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfoBean {

	private int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;

}
