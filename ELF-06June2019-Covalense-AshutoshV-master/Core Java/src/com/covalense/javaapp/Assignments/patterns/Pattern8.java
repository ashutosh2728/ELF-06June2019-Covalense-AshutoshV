package com.covalense.javaapp.assgn.patterns;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 5;
		int k = n / 2;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= k; j++) {
				if ((i + j) % 2 == 0 && (i + j) > 0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if (i < n / 2)
				k++;
			else
				k--;
			System.out.println();
		}
	}

}
