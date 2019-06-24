package com.covalense.javapp.customexception;

public class Validator {
	void stringValidate(String s) {
		if (s.length() >= 5) {
			System.out.println("Name is correct");
		} else {
			throw new InvalidNameException("You have entered wrong name");
		}
	}

}
