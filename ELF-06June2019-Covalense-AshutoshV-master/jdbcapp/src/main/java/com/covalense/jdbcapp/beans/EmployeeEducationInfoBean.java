package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeEducationInfoBean {
	private int id;
	private String educationType;
	private String degreeType;
	private String branch;
	private String collegeName;
	private String university;
	private String yop;
	private double percentage;
	private String location;

}
