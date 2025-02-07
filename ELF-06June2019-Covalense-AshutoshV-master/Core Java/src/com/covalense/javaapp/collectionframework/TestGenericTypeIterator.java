package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class TestGenericTypeIterator {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.6);
		al.add(6.9);
		al.add(5.2);

		Iterator<Double> it = al.iterator();
		while (it.hasNext()) {
			Double r = it.next();
			log.info("" + r);
		}
	}

}
