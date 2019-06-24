package com.covalense.javapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestGenericTypeStringAl {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Priya");
	al.add("Ruchi");
	al.add("Kavya");
	al.add("Sushmita");
	
	Iterator<String> it = al.iterator();
		/*
		 * while(it.hasNext()) { String r =it.next(); System.out.println(r); }
		 */
	for(int i=0;it.hasNext();i++) {
		String r =it.next();
		System.out.println(r); 
	}
}
}
