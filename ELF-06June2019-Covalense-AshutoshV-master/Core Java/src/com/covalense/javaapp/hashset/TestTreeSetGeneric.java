package com.covalense.javapp.collectionframework.hashset;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TestTreeSetGeneric {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet();
		ts.add(15);
		ts.add(20);
		ts.add(80);
		ts.add(45);
		ts.add(60);

		for (Integer r : ts) {
			log.info("" + r);
		}

		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			log.info("" + r);
		}

	}
}
