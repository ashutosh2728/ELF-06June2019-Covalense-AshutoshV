package com.covalense.javaapp.inheritance;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.Speed();

		Car c = new Car();
		c.Speed();
		c.Wheel();

		Bike b = new Bike();
		b.Gear();
		b.Speed();
	}

}
