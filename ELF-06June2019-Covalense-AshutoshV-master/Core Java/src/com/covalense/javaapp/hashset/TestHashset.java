package com.covalense.javapp.collectionframework.hashset;

import java.util.HashSet;

import java.util.Iterator;


import lombok.extern.java.Log;
@Log
public class TestHashset {
public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add(8);
		hs.add(3);
		hs.add(2);
		hs.add(1);

		for (Object r : hs) {
			log.info(""+r);
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			log.info(""+r);
		}

	}
}
