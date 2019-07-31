package com.covalense.hibernate.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="student_info")
public class StudentInfoBean {
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	StudentOtherInfoBean otherInfoBean;
	
	
	@Id
	private int rollNum;
	private String name;
	private int age;
	private String gender;
	private long mobileNo;
	private String emailId;
}
