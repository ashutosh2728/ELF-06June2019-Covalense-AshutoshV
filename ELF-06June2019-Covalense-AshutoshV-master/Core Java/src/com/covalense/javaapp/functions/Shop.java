package com.covalense.javapp.functions;

public class Shop {

	public static void main(String[] args) {
		int price=20;
		switch(price) {
		case 10 : System.out.println("You will get lays");
		break;
		case 20 : System.out.println("You will get Kurkure");
		break;
		case 50 : System.out.println("You will get Dairy Milk");
		break;
		default : System.out.println("Invalid Option");
		}

	}

}
