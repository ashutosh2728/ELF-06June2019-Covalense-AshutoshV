package com.covalense.javaapp.assgn.collections;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class MobileTest {
public static void main(String[] args) {
	MobileByCost m = new MobileByCost();
	TreeSet<Mobile> ts = new TreeSet<Mobile>(m);
	
	Mobile m1=new Mobile();
	m1.brand="MI";
	m1.model="A";
	m1.cost = 10000;
	
	Mobile m2=new Mobile();
	m2.brand="Lenovo";
	m2.model="B";
	m2.cost = 25000;
	
	Mobile m3=new Mobile();
	m3.brand="IPhone";
	m3.model="C";
	m3.cost = 65000;
	
	Mobile m4=new Mobile();
	m4.brand="Asus";
	m4.model="D";
	m4.cost = 30000;
	
	ts.add(m1);
	ts.add(m2);
	ts.add(m3);
	ts.add(m4);
	
	for(Mobile t : ts) {
		log.info("Brand : "+t.brand);		
		log.info("Model : "+t.model);
		log.info("Cost : "+t.cost);
	}
	
}
}
