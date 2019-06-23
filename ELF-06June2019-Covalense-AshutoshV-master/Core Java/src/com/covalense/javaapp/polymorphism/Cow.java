package com.covalense.javaapp.polymorphism;

import lombok.extern.java.Log;

@Log
public class Cow extends Animal {
	void eat() {
		log.info("Cow eating grass");
	}
}
