package com.covalense.javaapp.polymorphism;

import lombok.extern.java.Log;

@Log
public class Lion extends Animal {
	void eat() {
		log.info("Lion eating meat");
	}
}
