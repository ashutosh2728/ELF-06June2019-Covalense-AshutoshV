package com.covalense.javapp.functions;

public class FactorialRec {
	static int fact(int n ) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1); // Recursion
	}

	public static void main(String[] args) {
		System.out.println("factorial is "+ fact(5));
	}

}
