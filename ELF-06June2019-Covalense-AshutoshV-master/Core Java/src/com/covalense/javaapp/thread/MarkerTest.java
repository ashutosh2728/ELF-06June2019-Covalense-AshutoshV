package com.covalense.javaapp.thread;

public class MarkerTest {
	public static void main(String[] args) {
		Marker m = new Marker();
		Thread t = new Thread(m);
		t.start();
		Thread t1 = new Thread(m);
		t1.start();

	}
}
