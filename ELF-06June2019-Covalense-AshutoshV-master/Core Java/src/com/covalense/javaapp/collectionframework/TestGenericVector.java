package com.covalense.javapp.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestGenericVector {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		v.add(9.2);
		v.add(1.6);
		v.add(6.9);
		v.add(5.2);
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("---------------");
		for (Double d : v) {
			System.out.println(d);

		}
		System.out.println("---------------");
		Iterator<Double> it = v.iterator();
		while (it.hasNext()) {
			Double r = it.next();
			System.out.println(r);
		}

		System.out.println("---------------");
		ListIterator<Double> lit = v.listIterator();
		while (lit.hasNext()) {
			Double r = lit.next();
			System.out.println(r);
		}
		System.out.println("---------------");
		while (lit.hasPrevious()) {
			Double r = lit.previous();
			System.out.println(r);
		}
		Enumeration<Double> e = v.elements();
		System.out.println("---------------");
		while (e.hasMoreElements()) {
			Double r = e.nextElement();
			System.out.println(r);
		}
	}
}
