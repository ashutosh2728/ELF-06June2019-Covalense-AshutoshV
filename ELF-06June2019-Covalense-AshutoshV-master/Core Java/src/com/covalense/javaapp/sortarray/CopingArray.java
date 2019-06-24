package com.covalense.javaapp.sortarray;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class CopingArray {
	public static void main(String[] args) {
		int a[] = { 5, 2, 1, 4, 3 };

		int b[] = Arrays.copyOf(a, a.length);

		log.info("Contents of a[] ");
		for (int i = 0; i < a.length; i++)
			log.info(a[i] + " ");

		log.info("\n\nContents of b[] ");
		for (int i = 0; i < b.length; i++)
			log.info(b[i] + " ");
	}
}
