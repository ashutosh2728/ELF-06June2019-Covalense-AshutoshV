package com.covalense.javapp.functions;

public class BMITest1 {

	public static void main(String[] args) {
		Bmi1 a =new Bmi1();
		a.height=1.5;
		a.weight=70;
		a.calculateBMI();
		a.result();
	}

}
class Bmi1 {

	double weight;
	double height;
	double bmi;
	
	void calculateBMI() {
	bmi = weight/(height*height);
		System.out.println("BMI : "+bmi);
	}
	
	void result() { 
	
		if(bmi>=30)
			System.out.println("Persom is Obese");
			else if(bmi>=25)
				System.out.println("Person is Overweight");
			else if(bmi>=18.5)
				System.out.println("Person is normal");
			else
				System.out.println("Person is underweight");
	}

	}
