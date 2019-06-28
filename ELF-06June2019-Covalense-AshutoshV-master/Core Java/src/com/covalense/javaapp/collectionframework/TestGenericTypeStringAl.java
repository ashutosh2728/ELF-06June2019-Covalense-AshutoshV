package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class TestGenericTypeStringAl {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Priya");
		al.add("Ruchi");
		al.add("Kavya");
		al.add("Sushmita");

		Iterator<String> it = al.iterator();

		for (int i = 0; it.hasNext(); i++) {
			String r = it.next();
			log.info("" + r);
		}
	}
}
