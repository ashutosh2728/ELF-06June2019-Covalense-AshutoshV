package com.covalense.javapp.jspider;


public class TestCard {

	public static void main(String[] args) 
	{
		Card j = new Card();
		Card a = new Card();
		j.swipe();
		a.swipe();
		j.swipe();
		
		System.out.println("Java Count is "+j.count);
		System.out.println("Angular Count is "+a.count);
		System.out.println("Organisation count is "+ Card.orgCount);
		
	}

}
