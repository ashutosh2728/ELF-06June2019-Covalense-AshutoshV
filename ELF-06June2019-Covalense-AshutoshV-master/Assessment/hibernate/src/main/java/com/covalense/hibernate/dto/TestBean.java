package com.covalense.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Table(name="test")
@Entity
@Data
public class TestBean implements Serializable {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String city;


}
