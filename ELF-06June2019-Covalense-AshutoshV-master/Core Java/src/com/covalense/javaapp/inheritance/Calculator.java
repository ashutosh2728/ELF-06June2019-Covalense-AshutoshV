package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Calculator {
	void add() {
		log.info("Addition");
	}

	void sub() {
		log.info("Subtraction");
	}
}
@Log
class ScientificCalc extends Calculator {
	void log() {
		log.info("Logarithm");
	}

	void sin() {
		log.info("sin Function");
	}

	void cos() {
		log.info("cos  Function");
	}

	void tan() {
		System.out.println("tan function");
	}

}