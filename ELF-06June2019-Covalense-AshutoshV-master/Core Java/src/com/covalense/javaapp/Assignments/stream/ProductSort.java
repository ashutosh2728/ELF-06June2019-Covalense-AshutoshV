package com.covalense.javaapp.assgn.stream;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class ProductSort {
	public static void main(String[] args) {

		Product p1 = new Product("Televsion", 1, 12000);
		Product p2 = new Product("Mixer Grinder", 2, 8000);
		Product p3 = new Product("Home Theatre", 3, 9500);
		Product p4 = new Product("Refrigrator", 4, 15000);
		Comparator<Product> c = (i, j) -> {
			if (i.id > j.id) {
				return -1;
			} else if (i.id < j.id) {
				return 1;
			}
			return 0;
		};
		TreeSet<Product> t = new TreeSet<Product>(c);
		t.add(p1);
		t.add(p2);
		t.add(p3);
		t.add(p4);

		for (Product product : t) {
			log.info("" + product);
		}
	}

}
