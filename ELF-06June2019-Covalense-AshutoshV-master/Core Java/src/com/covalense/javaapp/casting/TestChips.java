package com.covalense.javaapp.casting;

public class TestChips {

	public static void main(String[] args) {
		Chips c = new Lays();
		Lays l = (Lays) c;
		l.eat();
		l.open();

		Chips d = new Bingo();
		Bingo b = (Bingo) d;
		b.open();
		b.byteBingo();

	}

}
