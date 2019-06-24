package com.covalense.javaapp.assgn.patterns;


public class Pattern2 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = i; j <n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
