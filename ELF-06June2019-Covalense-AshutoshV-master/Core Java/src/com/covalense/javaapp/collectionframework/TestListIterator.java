package com.covalense.javapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();	
		al.add(15);
		al.add(9.2);
		al.add("Divya");
		al.add('A');
		al.add(null);
		
		ListIterator li = al.listIterator(al.size());
		
		/*
		 * System.out.println("--------Forward-----"); while(li.hasNext()) { Object r =
		 * li.next(); System.out.println(r); }
		 */
		 
		System.out.println("--------Backward-----");
		while(li.hasPrevious()) {
			Object r = li.previous();
			System.out.println(r);
		}
	}

}
