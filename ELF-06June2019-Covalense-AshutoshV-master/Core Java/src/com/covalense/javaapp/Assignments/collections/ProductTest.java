package com.covalense.javaapp.assgn.collections;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class ProductTest {
public static void main(String[] args) {
	ArrayList<ProductInfo>al = new ArrayList<ProductInfo>();
	ProductInfo p1 = new ProductInfo();
	p1.setName("Notebook");
	p1.setCost(120);
	p1.setRating(7);

	ProductInfo p2 = new ProductInfo();
	p2.setName("Keyboard");
	p2.setCost(5000);
	p2.setRating(8);
	
	ProductInfo p3 = new ProductInfo();
	p3.setName("Mouse");
	p3.setCost(3000);
	p3.setRating(9);
	
	ProductInfo p4 = new ProductInfo();
	p4.setName("Pen");
	p4.setCost(1200);
	p4.setRating(5);
	
	ProductInfo p5 = new ProductInfo();
	p5.setName("Table");
	p5.setCost(8000);
	p5.setRating(8);
	
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(p4);
	al.add(p5);
	
	for(ProductInfo p : al) {
		if(p.getCost() < 2000) {
			log.info("Name :"+p.getName());
			log.info("Cost :"+p.getCost());
			log.info("Rating :"+p.getRating());
		}
	}
	
	
}
}
