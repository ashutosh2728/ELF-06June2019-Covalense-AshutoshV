package com.covalense.javaapp.assgn.assessment.productsortbyprice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ProductTest {
	public static void main(String[] args) {
		ArrayList<Product> arrayList = new ArrayList<Product>();
		Product prod1 = new Product(101, "Television", 250000);
		Product prod2 = new Product(102, "Refrigrator", 35000);
		Product prod3 = new Product(103, "Washing Machine", 15000);
		Product prod4 = new Product(104, "Ac", 50000);
		Product prod5 = new Product(105, "Mixer Grinder", 8000);
		arrayList.add(prod1);
		arrayList.add(prod2);
		arrayList.add(prod3);
		arrayList.add(prod4);
		arrayList.add(prod5);
		double min = 1000;
		double max = 20000;
		Predicate<Product> predicate = (i) -> i.price >= min && i.price <= max;
		List<Product> list = arrayList.stream().filter(predicate).collect(Collectors.toList());
		for (Product product : list) {
			log.info("" + product);
		}

	}
}
