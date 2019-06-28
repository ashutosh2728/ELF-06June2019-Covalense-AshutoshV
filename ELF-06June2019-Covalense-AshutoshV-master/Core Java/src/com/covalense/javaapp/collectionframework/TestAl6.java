package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestAl6 {
	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);

		ArrayList<Double> al2 = new ArrayList<Double>();
		al2.add(154.67);
		al2.add(786.97);

		log.info("Before----->" + al);

		al.addAll(al2);

		log.info("After----->" + al);
	}
}
