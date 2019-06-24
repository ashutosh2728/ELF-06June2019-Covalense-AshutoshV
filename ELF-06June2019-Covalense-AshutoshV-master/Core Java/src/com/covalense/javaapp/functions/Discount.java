package com.covalense.javapp.functions;

public class Discount {

	public static void main(String[] args) 
	{
		int visitCount = 1;
		double price= 1000;
		double disc = 15.4;
		if(visitCount==1)
		{
			price = price-(disc*price)/100;
					
		}
		System.out.print("price is "+price);

	}

}
