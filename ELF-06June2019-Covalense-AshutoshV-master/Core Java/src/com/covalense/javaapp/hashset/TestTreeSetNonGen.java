package com.covalense.javapp.collectionframework.hashset;

import java.util.Iterator;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TestTreeSetNonGen {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(15);
	ts.add("ashu");
	ts.add('s');
	ts.add(null);
	ts.add(60);

	for (Object r : ts) {
		log.info(""+r);
	}
	Iterator it = ts.iterator();
	while (it.hasNext()) {
		Object r = it.next();
		log.info(""+r);
	}

}
}
