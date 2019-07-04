package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeOtherInfoBean {
	private int id;
	private String pan;
	private boolean isMarried;
	private String bloodGrp;
	private boolean isChallenged;
	private int emergencyContactNum;
	private String emergencyContactName;
	private String nationality;
	private String relegion;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passport;
	private int adhar;

}
