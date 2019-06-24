package com.covalense.javapp.functions;

public class Car {

	public static void main(String[] args) 
	{
		int sprice = 570000;
		double rtoprice = (14.26*sprice)/100;
		double insprice = (9.76*sprice)/100;
		double price = sprice + rtoprice + insprice;
		
		System.out.println("Showroom price "+sprice);
		System.out.println("RTO "+ rtoprice);
		System.out.println("Insurance "+ insprice);
		System.out.println("On- Road Price "+price);
		
	}

}
