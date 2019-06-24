package com.covalense.javaapp.assgn.string;

public class TestProduct {

	public static void main(String[] args) {
		Product p[] = new Product[3];
		p[0] = new Product();
		p[1] = new Product();
		p[2] = new Product();

		p[0].setData("Pen", 1123, 100);
		p[1].setData("Pencil", 1122, 10);
		p[2].setData("Marker", 1124, 30);
		Database1 c = new Database1();
		Database2 d = new Database2();

		for (int i = 0; i < p.length; i++) {
			c.displayResult(p[i]);
			d.displayResult(p[i]);

		}
	}

}
