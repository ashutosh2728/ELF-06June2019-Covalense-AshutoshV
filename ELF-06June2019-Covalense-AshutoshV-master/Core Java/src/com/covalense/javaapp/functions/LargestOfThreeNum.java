package com.covalense.javapp.functions;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		int a =100;
		int b =290;
		int c=180;
		if(a>b && a>c) {
			System.out.println(a+" is greatest number");
		}
		else if(b>c) {
			System.out.println(b+" is greatest number");
		}
		else {
			System.out.println(c+" is greatest number");
		}

	}

}
