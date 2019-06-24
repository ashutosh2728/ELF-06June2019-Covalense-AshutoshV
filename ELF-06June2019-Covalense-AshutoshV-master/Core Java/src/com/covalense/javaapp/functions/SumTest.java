package com.covalense.javapp.functions;

public class SumTest {
	static int sum(int a , int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) 
	{
		int c = sum(5,10);
		System.out.println("Sum is "+c);
	}

}
