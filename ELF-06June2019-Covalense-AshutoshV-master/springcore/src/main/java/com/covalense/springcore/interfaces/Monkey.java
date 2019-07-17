package com.covalense.springcore.interfaces;

import lombok.extern.java.Log;

@Log
public class Monkey implements Animal {

	public void eat() {
		log.info("Eating banana");
	}

	public void makeSound() {
		log.info("Making monkeys sound");
	}

}
