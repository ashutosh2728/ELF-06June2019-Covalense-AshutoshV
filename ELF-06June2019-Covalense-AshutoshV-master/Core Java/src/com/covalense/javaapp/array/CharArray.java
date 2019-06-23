package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class CharArray {
	public static void main(String[] args) {
		char[] a = { 'A', 'S', 'H', 'U' };
		for (int i = a.length - 1; i >= 0; i++) {
			log.info("" + a[i]);
			
		}
		log.info("" + a.length);
	}
}
