package com.covalense.javapp.customexception;

import lombok.extern.java.Log;

@Log
public class Validator {
	void stringValidate(String s) {
		if (s.length() >= 5) {
			log.info("Name is correct");
		} else {
			throw new InvalidNameException("You have entered wrong name");
		}
	}

}
