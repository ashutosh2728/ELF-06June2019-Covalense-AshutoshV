package com.covalense.javapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(15);
		ll.add(9.2);
		ll.add("Divya");
		ll.add('A');
		ll.add(null);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("---------------");
		for (Object o : ll) {
			System.out.println(o);

		}
		System.out.println("---------------");
		Iterator it = ll.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		
		System.out.println("---------------");
		ListIterator lit =  ll.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}	
		System.out.println("---------------");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
	}

}
