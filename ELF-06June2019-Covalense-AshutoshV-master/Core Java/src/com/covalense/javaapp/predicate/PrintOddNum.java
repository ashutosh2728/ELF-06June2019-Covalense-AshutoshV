package com.covalense.javaapp.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class PrintOddNum {
	public static void main(String[] args) {
		int[] b = { 2, 5, 9, 6, 4, 3 };
		Predicate<Integer> p = i -> i % 2 != 0;
		for (int i = 0; i < b.length; i++) {
			 
			if (p.test(b[i])) {
				log.info("" + b[i]);
			}
		}
	}

}
