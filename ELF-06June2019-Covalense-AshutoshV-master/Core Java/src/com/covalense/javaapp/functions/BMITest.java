package com.covalense.javapp.functions;

public class BMITest {
	
	static double bmiCalc(double w , double h)
	{
		double bmi = w/(h*h);
		return bmi;
		
	}
	static void result(double bmi)
	{
		double res = bmiCalc(70,1);
		if(res>=30)
		System.out.println("Persom is Obese");
		else if(res>=25)
			System.out.println("Person is Overweight");
		else if(res>=18.5)
			System.out.println("Person is normal");
		else
			System.out.println("Person is underweight");
	}

	public static void main(String[] args) 
	{
		double r = bmiCalc(70,1.5);
		System.out.println("BMI is " + r);
		result(r);
	}

}
