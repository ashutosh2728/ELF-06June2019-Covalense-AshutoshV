package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestArrayList1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(9.2);
		al.add("Divya");
		al.add('A');
		al.add(null);

		for (Object o : al) {
			log.info("" + o);
		}

	}

}
