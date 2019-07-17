package com.covalense.springcore.interfaces;

import lombok.extern.java.Log;

@Log
public class Donkey implements Animal {

	public void eat() {
		log.info("eating grass");
	}

	public void makeSound() {
		log.info("dehchu dehchu....");
	}

}
