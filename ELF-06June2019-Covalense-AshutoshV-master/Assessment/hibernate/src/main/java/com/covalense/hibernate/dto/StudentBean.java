package com.covalense.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentBean {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String subject;
	private double totalMarks;
	

}
