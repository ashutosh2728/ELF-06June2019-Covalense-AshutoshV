package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class TestIterator {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add("Divya");
		al.add('A');
		al.add(null);

		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			log.info("" + r);
		}

	}

}
