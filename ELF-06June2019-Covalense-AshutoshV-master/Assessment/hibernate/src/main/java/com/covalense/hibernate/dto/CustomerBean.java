package com.covalense.hibernate.dto;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class CustomerBean implements Serializable{

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private long contactNumber;
	private String address;
	private String city;
	private String state;
	private String country;
	
	
}
