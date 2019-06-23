package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

@Log
public abstract class Honda {
	void engine() {
		log.info("I am  a engine method");
	}

	abstract void design();
}
