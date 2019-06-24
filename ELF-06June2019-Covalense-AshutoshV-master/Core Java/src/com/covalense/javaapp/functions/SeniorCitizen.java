package com.covalense.javapp.functions;

public class SeniorCitizen {

	public static void main(String[] args)
	{
		int age = 65;
		double disc = 15.8;
		double tcktPrice = 1500;
		if(age>=60)
		{
			tcktPrice=tcktPrice-(disc*tcktPrice)/100;
			
		}
		System.out.println("Your ticket price is "+tcktPrice);
		
	}

}
