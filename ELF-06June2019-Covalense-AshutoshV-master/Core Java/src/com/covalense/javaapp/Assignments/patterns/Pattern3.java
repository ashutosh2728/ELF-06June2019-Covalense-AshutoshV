package com.covalense.javaapp.assgn.patterns;


public class Pattern3 {
	public static void main(String[] args) {
		int n = 7;
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= k; j++) {
				System.out.print("*");
			}
			if (i < n / 2)
				k++;
			else
				k--;
			System.out.println();
		}
	}

}
