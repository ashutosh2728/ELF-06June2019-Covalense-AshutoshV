package com.covalense.javaapp.map;

import java.util.Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import lombok.extern.java.Log;

@Log
public class TestHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);
		hm.put("Four", 4);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String s = e.getKey();
			Integer i = e.getValue();
			log.info("Key is " + s);
			log.info("Value is " + i);

		}
		log.info("Only Keys");
		Set<String> ts = hm.keySet();
		for (String u : ts) {
			log.info(u);
		}

		log.info("Only Values");
		Collection<Integer> ci = hm.values();
		Iterator<Integer> it = ci.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
			log.info("" + r);
			;
		}

	}
}
