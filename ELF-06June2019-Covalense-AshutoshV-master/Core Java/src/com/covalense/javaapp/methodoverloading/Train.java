package com.covalense.javaapp.methodoverloading;

import lombok.extern.java.Log;

@Log
public class Train {
	void search(int i) {
		log.info("Search by id");
	}

	void search(String s) {
		log.info("Search by name");
	}
}
