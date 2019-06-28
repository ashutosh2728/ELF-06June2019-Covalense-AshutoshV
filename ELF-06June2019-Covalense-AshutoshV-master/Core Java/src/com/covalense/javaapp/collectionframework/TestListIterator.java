package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

import lombok.extern.java.Log;

@Log
public class TestListIterator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add("Divya");
		al.add('A');
		al.add(null);

		ListIterator li = al.listIterator(al.size());

		log.info("--------Backward-----");
		while (li.hasPrevious()) {
			Object r = li.previous();
			log.info("" + r);
		}
	}

}
