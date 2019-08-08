package com.covalense.empspringmvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@SuppressWarnings("serial")
@Table(name = "employee_educationalinfo")
public class EmployeeEducationalInfoBean implements Serializable {

	@EmbeddedId
	EmployeeEducationalInfoPKBean educationalInfoPKBean;

	@Column(name = "DEGREE_TYPE")
	private String degreeType;
	@Column(name = "BRANCH")
	private String branch;
	@Column(name = "COLLEGE_NM")
	private String collegeName;
	@Column(name = "UNIVERSITY")
	private String university;
	@Column(name = "YOP")
	private String yop;
	@Column(name = "PERCENTAGE")
	private double percentage;
	@Column(name = "LOCATION")
	private String location;

}
