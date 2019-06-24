package com.covalense.javaapp.casting;

public class TestPen {
	public static void main(String[] args) {
		Pen p = new Marker();
		p.cost = 24;
		p.write();

		Marker m = (Marker) p;
		m.cost = 83;
		m.size = 12;
		m.color();
		m.write();
	}
}
