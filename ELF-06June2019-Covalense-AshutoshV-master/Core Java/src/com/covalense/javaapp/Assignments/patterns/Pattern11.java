package com.covalense.javaapp.assgn.patterns;

public class Pattern11 {

	public static void main(String[] args) {
		System.out.print("ënter no of rows");
		int n = 15;
		int c1 = (n - 1) / 2;
		int c2 = 3 * n / 2 - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == c1 || i - j == c1 || j - i == c1 || i + j == c2 || i == c1 || j == c1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
