package com.covalense.javaapp.abstraction;
public class Machine {
	void swipe(ATMCard a) {
		a.validate();
		a.getInfo();
	}
}
