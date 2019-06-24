package com.covalense.javapp.collectionframework;

import java.util.ArrayList;

public class TestGenericArrayList {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(9.2);
		al.add(1.6);
		al.add(6.9);
		al.add(5.2);

		for (int i = 0; i < al.size(); i++) {
			Double r = al.get(i);
			System.out.println(r);
		}
		System.out.println("--------------");
		for (Double r : al) {
			System.out.println();
		}
	}

}
