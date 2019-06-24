package com.covalense.javaapp.map;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.extern.java.Log;

@Log
public class TestLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
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
	}
}
