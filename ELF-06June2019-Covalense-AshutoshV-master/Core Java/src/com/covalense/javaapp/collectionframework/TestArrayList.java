package com.covalense.javapp.collectionframework;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();	
	al.add(15);
	al.add(9.2);
	al.add("Divya");
	al.add('A');
	al.add(null);
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
		
		
	}

}
