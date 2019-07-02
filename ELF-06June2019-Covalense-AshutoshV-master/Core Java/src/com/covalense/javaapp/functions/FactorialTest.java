package com.covalense.javapp.functions;

public class FactorialTest {

	 static int factorial(int n) {
		int res=1;
		for(int i =1;i<=n;i++) {
			res =res*i;
		}
		return res;
	}
	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println("factorial is "+res);
	}

}
