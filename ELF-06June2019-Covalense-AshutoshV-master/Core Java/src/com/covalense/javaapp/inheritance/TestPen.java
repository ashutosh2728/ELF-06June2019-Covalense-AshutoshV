package com.covalense.javaapp.inheritance;

public class TestPen {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost();
		p.write();

		Marker m = new Marker();
		m.color();
		m.cost();
		m.write();

		Pen p1 = new Marker();
		p.cost = 100;
		p1.cost();
		p1.write();

	}

}
