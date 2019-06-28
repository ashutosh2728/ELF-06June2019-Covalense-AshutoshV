package com.covalense.javaapp.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class TestGenericVector {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		v.add(9.2);
		v.add(1.6);
		v.add(6.9);
		v.add(5.2);
		for (int i = 0; i < v.size(); i++) {
			log.info("" + v.get(i));
		}
		log.info("-------------------");
		for (Double d : v) {
			log.info("" + d);

		}
		log.info("-------------------");
		Iterator<Double> it = v.iterator();
		while (it.hasNext()) {
			Double r = it.next();
			log.info("" + r);
		}

		log.info("-------------------");
		ListIterator<Double> lit = v.listIterator();
		while (lit.hasNext()) {
			Double r = lit.next();
			log.info("" + r);
		}
		log.info("-------------------");
		while (lit.hasPrevious()) {
			Double r = lit.previous();
			log.info("" + r);
		}
		Enumeration<Double> e = v.elements();
		log.info("-------------------");
		while (e.hasMoreElements()) {
			Double r = e.nextElement();
			log.info("" + r);
		}
	}
}
