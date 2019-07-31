package com.covalense.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="student_otherInfo")
public class StudentOtherInfoBean {
	@Id
	private int rollNum;
	private String fatherName;
	private String motherName;
	private String relegion;
	private String nationality;
	
	
	
}
