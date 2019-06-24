package com.covalense.javaapp.assgn.patterns;


public class Pattern9 {
	public static void main(String[] args) {
		int n = 7;
		int sp = 0;

		for (int i = 0; i < n; i++) {
			int k = 1;
			for (int j = sp; j < n / 2; j++) {
				if (i != n / 2)
					System.out.print(" ");
				else
					k = n;
			}
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
