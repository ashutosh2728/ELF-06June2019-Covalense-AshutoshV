package com.covalense.javapp.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(15);
		v.add(9.2);
		v.add("Divya");
		v.add('A');
		v.add(null);
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("---------------");
		for (Object o : v) {
			System.out.println(o);

		}
		System.out.println("---------------");
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}

		System.out.println("---------------");
		ListIterator lit = v.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			System.out.println(r);
		}
		System.out.println("---------------");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			System.out.println(r);
		}
		Enumeration e = v.elements();
		System.out.println("---------------");
		while (e.hasMoreElements()) {
			Object r = e.nextElement();
			System.out.println(r);
		}
	}

}
