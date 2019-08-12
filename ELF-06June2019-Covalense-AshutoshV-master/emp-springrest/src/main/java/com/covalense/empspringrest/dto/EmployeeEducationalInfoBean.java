package com.covalense.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
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
	private Double percentage;
	@Column(name = "LOCATION")
	private String location;

	public EmployeeEducationalInfoPKBean getEducationalInfoPKBean() {
		return educationalInfoPKBean;
	}

	public void setEducationalInfoPKBean(EmployeeEducationalInfoPKBean educationalInfoPKBean) {
		this.educationalInfoPKBean = educationalInfoPKBean;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
