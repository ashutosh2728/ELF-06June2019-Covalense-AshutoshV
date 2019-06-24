package com.covalense.javaapp.assgn.patterns;


public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		int sp = 0;
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = sp; j < n / 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print("*");
			}
			if (i < n / 2) {
				sp++;
				k++;
			} else {
				sp--;
				k--;
			}
			System.out.println();
		}

	}

}
