package com.covalense.javaapp.sortarray;

import java.util.Arrays;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
public class SortArray {
	public static void main(String[] args) {
		Integer[] a = { 5, 2, 1, 4, 3 };
		Arrays.sort(a,Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			log.info(a[i] + " ");
		}

	}

}
