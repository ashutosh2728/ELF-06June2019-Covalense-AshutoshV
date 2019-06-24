package com.covalense.javaapp.instanceof1;

import lombok.extern.java.Log;

@Log
public class Girl {
	void recieve(Phone p) {
		if (p instanceof IPhone) {
			log.info("I Luv u");
		} else if (p instanceof MIPhone) {
			log.info("Thank you brother");
		}

	}
}
