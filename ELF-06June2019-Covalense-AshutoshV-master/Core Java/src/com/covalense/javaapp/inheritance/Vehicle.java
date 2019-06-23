package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Vehicle {
	void Speed() {
		log.info("Speed Method");
	}

}

@Log
class Car extends Vehicle {
	void Wheel() {
		log.info("Wheel Method");
	}
}

@Log
class Bike extends Vehicle {
	void Gear() {
		log.info("Gear Method");
	}
}
