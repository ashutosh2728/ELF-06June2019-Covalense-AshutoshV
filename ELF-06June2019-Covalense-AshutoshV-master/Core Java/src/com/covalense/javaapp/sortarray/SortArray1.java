package com.covalense.javaapp.sortarray;

import java.util.Arrays;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class SortArray1 {
	public static void main(String[] args) {
		Double[] a = { 2.4, 6.9, 3.2, 4.6 };
		Arrays.sort(a,Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			log.info(a[i] + " ");
		}
	}

}
