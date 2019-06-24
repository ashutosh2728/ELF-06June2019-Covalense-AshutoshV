package com.covalense.javaapp.lamdaexp.factorial;

import lombok.extern.java.Log;

@Log
public class FactorialTest {
public static void main(String[] args) {
	int fact=5;
	Factorial f =n -> {
		int sum=1;
		for(int i=1;i<=n;i++) {
		sum=sum*n;
		n--;
		}
		return sum;
	};
	log.info("Factorial of a number is "+ f.fact(fact));
}

}
