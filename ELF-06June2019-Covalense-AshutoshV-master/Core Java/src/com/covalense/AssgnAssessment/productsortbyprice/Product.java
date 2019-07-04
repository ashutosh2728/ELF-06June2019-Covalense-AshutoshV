package com.covalense.javaapp.assgn.assessment.productsortbyprice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	int id;
	String name;
	double price;

}
