package com.covalense.javaapp.customexception;

import lombok.extern.java.Log;

@Log
public class InvalidTemperationException  extends Exception{
	int temp;

	public InvalidTemperationException() {
	log.info("Invalid temperature");
	}
	
}
