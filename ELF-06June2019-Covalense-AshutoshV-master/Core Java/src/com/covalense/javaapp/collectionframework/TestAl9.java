package com.covalense.javapp.collectionframework;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestAl9 {
	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		log.info("Before----->" + al);

		log.info("After----->" + al);
	}
}
