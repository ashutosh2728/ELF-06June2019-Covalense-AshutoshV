package com.covalense.javapp.functions;

public class Grade {

	public static void main(String[] args) 
	{
		int perc = 76;
		if(perc>=60)
		{
			System.out.println("Grade is A");
		}
		else if(perc>=50)
		{
			System.out.println("Grade is B");
		}
		else if(perc>=40)
		{
			System.out.println("Grade is C");
		}
		else 
			System.out.println("Fail");
	
	}

}
