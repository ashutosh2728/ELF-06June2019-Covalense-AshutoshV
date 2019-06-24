package com.covalense.javaapp.assgn.passingobj;

public class Employee 
{
	String name;
	int id;
	
	void search(String name)
	{
		this.name = name;
		System.out.println("Searching by name");
		
	}
	void search(int id)
	{
		this.id = id;
		System.out.println("Searching by id");
	}

}
