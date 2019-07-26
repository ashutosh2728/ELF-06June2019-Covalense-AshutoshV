package com.covalense.empspringmvc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "employee_otherinfo")
@Entity
@Data
public class EmployeeOtherInfoBean {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "pan")
	private String pan;
	@Column(name = "isMarried")
	private boolean isMarried;
	@Column(name = "blood_Grp")
	private String bloodGrp;
	@Column(name = "isChallenged")
	private boolean isChallenged;
	@Column(name = "emergencty_Contact_Number")
	private int emergencyContactNum;
	@Column(name = "emergency_Contact_Name")
	private String emergencyContactName;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "relegion")
	private String relegion;
	@Column(name = "father_Nm")
	private String fatherName;
	@Column(name = "mother_Nm")
	private String motherName;
	@Column(name = "spouse_Nm")
	private String spouseName;
	@Column(name = "passport")
	private String passport;
	@Column(name = "adhar")
	private int adhar;

}
