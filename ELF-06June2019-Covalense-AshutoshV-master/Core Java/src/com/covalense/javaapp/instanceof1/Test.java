package com.covalense.javaapp.instanceof1;

public class Test {
	public static void main(String[] args) {
		Girl g = new Girl();
		MIPhone m = new MIPhone();
		IPhone i = new IPhone();
		g.recieve(m);
		g.recieve(i);
	}
}
