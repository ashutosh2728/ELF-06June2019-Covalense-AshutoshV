package com.covalense.javapp.functions;

public class LanguageTest {

	public static void main(String[] args) 
	{
		int lang = 3;
		switch(lang)
		{
		case 1 : System.out.println("Selected language is Kannada");
		break;
		case 2 : System.out.println("Selected language is English");
		break;
		case 3 : System.out.println("Selected language is hindi");
		break;
		case 4 : System.out.println("Selected language is Tamil");
		break;
		default : System.out.println("Invalid option");
		}
	}

}
