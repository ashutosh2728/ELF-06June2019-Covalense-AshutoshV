package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

@Log
public class Person implements Animal, Human {
	public void eat() {
		log.info("Eat Method");
	}

	public void walk() {
		log.info("Walk Method");
	}

}
