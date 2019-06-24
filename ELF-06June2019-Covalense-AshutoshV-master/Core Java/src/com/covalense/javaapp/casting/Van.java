package com.covalense.javaapp.casting;

import lombok.extern.java.Log;

@Log
public class Van extends Bus {
	int seats;

	void turn() {
		log.info("Turn Method");
	}

}
