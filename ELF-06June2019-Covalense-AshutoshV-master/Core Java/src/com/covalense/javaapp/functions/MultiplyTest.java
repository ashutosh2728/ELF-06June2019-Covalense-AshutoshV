package com.covalense.javapp.functions;

public class MultiplyTest {
	
	static int  multiply(int a , int b)
	{
		int c =a*b;
		return  c;
	}

	public static void main(String[] args)
	{
		int c = multiply(5,10);
		System.out.println("Multiplication is "+c);
	}

}
