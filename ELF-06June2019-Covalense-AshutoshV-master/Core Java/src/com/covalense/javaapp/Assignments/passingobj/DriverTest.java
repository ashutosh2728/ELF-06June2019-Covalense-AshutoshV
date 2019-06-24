package com.covalense.javaapp.assgn.passingobj;


public class DriverTest {

	public static void main(String[] args) 
	{
		Driver d = new Driver();
		Benz b = new Benz();
		Audi a = new Audi();
		
		d.drive(a);
		d.drive(b);

	}

}
