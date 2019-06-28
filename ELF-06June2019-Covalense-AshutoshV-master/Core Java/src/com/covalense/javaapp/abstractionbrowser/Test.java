package com.covalense.javaapp.abstractionbrowser;

public class Test {
	public static void main(String[] args) {

		Google g = new Gmail();
		Google s = new GoogleDrive();

		Browser b = new Browser();
		b.open(s);
		b.open(g);

	}
}
