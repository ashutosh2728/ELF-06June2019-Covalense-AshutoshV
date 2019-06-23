package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class SBI implements ATMCard {

	@Override
	public void validate() {
		log.info("Validating using SBI Card");
	}

	@Override
	public void getInfo() {
		log.info("Getting info using SBI Card");
	}

}
