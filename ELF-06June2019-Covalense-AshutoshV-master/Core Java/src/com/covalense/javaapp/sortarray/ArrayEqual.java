package com.covalense.javaapp.sortarray;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ArrayEqual {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4 };
		int[] arr2 = new int[] { 1, 2, 3, 4 };
		boolean flag = Arrays.equals(arr1, arr2);

		if (flag) {
			log.info("Arrays are equal");
		} else {
			log.info("Arrays are not equal");
		}

	}
}
