package com.covalense.javapp.collectionframework.hashset;

import java.util.HashSet;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class TestGenericHashset {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		hs.add(15);
		hs.add(20);
		hs.add(null);
		hs.add(45);
		hs.add(60);

		for (Integer r : hs) {
			log.info("" + r);
		}
		log.info("------------------");
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			log.info("" + r);
		}

	}

}
