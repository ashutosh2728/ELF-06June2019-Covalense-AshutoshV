package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

@Log
public class Sony implements Printer {
	public void print() {
		log.info("Print Method");
	}

}
