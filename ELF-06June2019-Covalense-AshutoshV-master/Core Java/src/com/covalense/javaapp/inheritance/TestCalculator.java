package com.covalense.javaapp.inheritance;

public class TestCalculator {

	public static void main(String[] args) {
		ScientificCalc sc = new ScientificCalc();
		sc.add();
		sc.sub();
		sc.cos();
		sc.log();

		Calculator c = new Calculator();
		c.add();
		c.sub();

	}

}
