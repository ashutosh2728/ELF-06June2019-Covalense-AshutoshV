package com.covalense.empspringrest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@Table(name = "employee_otherinfo")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class EmployeeOtherInfoBean implements Serializable {

	@XmlTransient
	@JoinColumn(name = "id")
	@Id
	@OneToOne
	EmployeeInfoBean infoBean;

	@Column(name = "pan")
	private String pan;
	@Column(name = "isMarried")
	private boolean isMarried;
	@Column(name = "blood_Grp")
	private String bloodGrp;
	@Column(name = "isChallenged")
	private boolean isChallenged;
	@Column(name = "emergencty_Contact_Number")
	private Integer emergencyContactNum;
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
	private Integer adhar;

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public boolean isChallenged() {
		return isChallenged;
	}

	public void setChallenged(boolean isChallenged) {
		this.isChallenged = isChallenged;
	}

	public Integer getEmergencyContactNum() {
		return emergencyContactNum;
	}

	public void setEmergencyContactNum(Integer emergencyContactNum) {
		this.emergencyContactNum = emergencyContactNum;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRelegion() {
		return relegion;
	}

	public void setRelegion(String relegion) {
		this.relegion = relegion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public Integer getAdhar() {
		return adhar;
	}

	public void setAdhar(Integer adhar) {
		this.adhar = adhar;
	}

}
