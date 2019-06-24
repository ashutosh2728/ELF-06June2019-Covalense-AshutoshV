package com.covalense.javaapp.assgn.passingobj;


public class Driver 
{
	void drive(Car c)
	{
		if (c instanceof Benz) {
			System.out.println("driving Benz Car");
		} else if (c instanceof Audi) {
			System.out.println("driving Audi Car");
		}
		
	}
}
