package com.covalense.javaapp.supplier;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestCar {
public static void main(String[] args) {
	Supplier<Car> s = ()->new Car(15.5);
	Car c =s.get();
	log.info(""+c.fuel);
}
}
