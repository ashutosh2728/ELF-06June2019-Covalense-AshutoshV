package com.covalense.javapp.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(15);
		ll.add(9.2);
		ll.add("Divya");
		ll.add('A');
		ll.add(null);
		for (int i = 0; i < ll.size(); i++) {
			log.info("" + ll.get(i));
		}
		log.info("------------------------");
		for (Object o : ll) {
			log.info("" + o);

		}
		log.info("------------------------");
		Iterator it = ll.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			log.info("" + r);
		}

		log.info("------------------------");
		ListIterator lit = ll.listIterator();
		while (lit.hasNext()) {
			Object r = lit.next();
			log.info("" + r);
		}
		log.info("------------------------");
		while (lit.hasPrevious()) {
			Object r = lit.previous();
			log.info("" + r);
		}
	}

}
