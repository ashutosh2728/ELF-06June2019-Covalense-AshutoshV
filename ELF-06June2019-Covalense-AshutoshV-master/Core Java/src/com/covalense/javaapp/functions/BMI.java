package com.covalense.javapp.functions;

public class BMI {

	public static void main(String[] args)
	{
		double weight = 70;
		double height = 1.75;
		double bmi = weight/(height*height);
		System.out.println("BMI : "+bmi);
	}

}
