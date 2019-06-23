package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class Array {
	public static void main(String[] args) {

		int[] a = { 4, 5, 6, 7, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			log.info("" + a[i]);

		}
		log.info("" + a.length);
	}

}
