package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class HDFC implements ATMCard {
	public void validate() {
		log.info("Validating using HDFC Card");
	}

	public void getInfo() {
		log.info("Getting info using HDFC Card");
	}
}
