package com.covalense.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductsBean implements Serializable {
	@Id
	private int productId;
	private String productName;
	private double price;
	private String color;
	private double weight;

}
