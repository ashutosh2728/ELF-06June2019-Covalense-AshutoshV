package com.covalense.javaapp.exceptionhandling;

import lombok.extern.java.Log;

@Log
public class Paytm {

	void ticket() {
		log.fine("Ticket booking started");
		IRCTC a = new IRCTC();

		try {
			log.info("" + 10 / 0);
		} catch (ArithmeticException e) {
			log.warning("Dont Refresh");
		}
		a.paymentStatus();

		log.info("Ticket booking Completed");
	}

}
