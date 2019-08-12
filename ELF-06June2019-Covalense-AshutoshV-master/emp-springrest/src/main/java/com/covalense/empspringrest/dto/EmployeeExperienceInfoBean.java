package com.covalense.empspringrest.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_experience_info")
public class EmployeeExperienceInfoBean implements Serializable {

	@EmbeddedId
	EmployeeExperienceInfoPKBean employeeExperienceInfoPKBean;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "LEAVING_DATE")
	private Date leavingDate;

	public EmployeeExperienceInfoPKBean getEmployeeExperienceInfoPKBean() {
		return employeeExperienceInfoPKBean;
	}

	public void setEmployeeExperienceInfoPKBean(EmployeeExperienceInfoPKBean employeeExperienceInfoPKBean) {
		this.employeeExperienceInfoPKBean = employeeExperienceInfoPKBean;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

}
