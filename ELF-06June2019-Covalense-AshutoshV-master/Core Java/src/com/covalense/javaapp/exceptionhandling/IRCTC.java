package com.covalense.javaapp.exceptionhandling;

import lombok.extern.java.Log;

@Log
public class IRCTC {

	void paymentStatus() {
		log.info("Please wait your request is processing");
		int a[] = new int[3];
		try {
			log.info("" + a[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			log.severe("Payment failed");
		}

		log.fine("Payment completed successfully");

	}

}
