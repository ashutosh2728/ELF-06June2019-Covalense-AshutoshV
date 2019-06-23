package com.covalense.javaapp.abstraction;

public class Test {
	public static void main(String[] args) {

		Machine m = new Machine();
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		SBI s = new SBI();
		m.swipe(s);
		m.swipe(h);
		m.swipe(i);
	}

}
