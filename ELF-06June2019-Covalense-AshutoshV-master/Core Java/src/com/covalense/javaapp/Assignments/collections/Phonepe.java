package com.covalense.javaapp.assgn.collections;

import lombok.extern.java.Log;

@Log
public class Phonepe {
	void ticket() {
		log.info("ticket booking started");
		Myntra m = new Myntra();

		try {
			log.info("" + 10 / 0);
			m.paymentStatus();
		} catch (ArithmeticException e) {
			log.severe("Dont refresh");
		}

	}
}
