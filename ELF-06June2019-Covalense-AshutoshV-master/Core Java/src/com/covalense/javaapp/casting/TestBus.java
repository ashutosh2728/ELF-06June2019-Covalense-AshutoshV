package com.covalense.javaapp.casting;

public class TestBus {
	public static void main(String[] args) {
		Bus b = new Van();
		b.move();
		b.model=1334;
		
		Van v = (Van)b;
		v.model=134;
		v.seats=23;
		v.move();
		v.turn();
	}

}
