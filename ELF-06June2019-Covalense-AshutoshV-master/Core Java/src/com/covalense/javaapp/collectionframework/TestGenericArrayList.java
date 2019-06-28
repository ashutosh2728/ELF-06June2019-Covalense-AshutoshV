package com.covalense.javaapp.collectionframework;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class TestGenericArrayList {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.6);
		al.add(6.9);
		al.add(5.2);

		for (int i = 0; i < al.size(); i++) {
			Double r = al.get(i);
			log.info("" + r);
		}
		System.out.println("--------------");
		for (Double r : al) {
			log.info("" + r);
		}
	}

}
