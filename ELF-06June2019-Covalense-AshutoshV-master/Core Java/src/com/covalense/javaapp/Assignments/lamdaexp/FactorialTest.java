package com.covalense.javaapp.assgn.lamdaexp;

public class FactorialTest {
public static void main(String[] args) {
	Factorial f =n -> {
		int sum=1;
		for(int i=1;i<=n;i++) {
		sum=sum*n;
		n--;
		}
		return sum;
	};
	
	int res = f.fact(5);
	System.out.println("Factorial is "+res);
}

}
