package com.covalense.javapp.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

import lombok.extern.java.Log;

@Log
public class TestVector {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(15);
		v.add(9.2);
		v.add("Divya");
		v.add('A');
		v.add(null);
		for (int i = 0; i < v.size(); i++) {
			log.info("" + v.get(i));
		}
		log.info("------------------------");
		for (Object o : v) {
			log.info("" + o);

		}
		log.info("------------------------");
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			log.info("" + r);
		}

		log.info("------------------------");
		ListIterator lit = v.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			log.info("" + r);
		}
		log.info("------------------------");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			log.info("" + r);
		}
		Enumeration e = v.elements();
		log.info("------------------------");
		while (e.hasMoreElements()) {
			Object r = e.nextElement();
			log.info("" + r);
		}
	}

}
