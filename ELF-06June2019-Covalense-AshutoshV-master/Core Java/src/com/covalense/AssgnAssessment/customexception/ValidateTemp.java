package com.covalense.javaapp.customexception;

import lombok.extern.java.Log;

@Log
public class ValidateTemp  {
	

	void validator(int temp) {

		try {

			if (temp > 18) {
				throw new InvalidTemperationException();
			} else {
				log.info("Your temperature is right");
			}
		} catch (InvalidTemperationException e) {
			e.getMessage();
		}
	}

}
