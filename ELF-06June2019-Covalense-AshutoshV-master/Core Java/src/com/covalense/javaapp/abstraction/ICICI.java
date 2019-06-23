package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class ICICI implements ATMCard {
	public void validate() {
		log.info("Validating using ICICI Card");
	}

	public void getInfo() {
		log.info("Getting info using ICICI Card");
	}
}
