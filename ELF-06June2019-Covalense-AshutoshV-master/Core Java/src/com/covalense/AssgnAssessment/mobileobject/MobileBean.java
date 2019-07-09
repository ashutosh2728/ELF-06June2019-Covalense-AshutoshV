package com.covalense.assgnassessment.mobileobject;

import java.io.Serializable;

import lombok.Data;

@Data
public class MobileBean implements Serializable {
	private String name;
	private String brand;
	private double price;
	
}
