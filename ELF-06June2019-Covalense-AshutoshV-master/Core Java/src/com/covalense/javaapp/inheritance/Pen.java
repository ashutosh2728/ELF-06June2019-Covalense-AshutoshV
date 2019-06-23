package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Pen {
	int cost;

	void cost() {
		log.info("Cost Method");
	}

	void write() {
		log.info("Write Method");
	}
}

@Log
class Marker extends Pen {
	void color() {
		log.info("Color Method");
	}
}