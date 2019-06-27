package com.covalense.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class MarkerTest {
	public static void main(String[] args) {

		Runnable x = () -> {
			for (int i = 0; i <= 5; i++) {
				log.info("" + i);

			}
		};

		Thread t1 = new Thread(x);
		t1.start();
	}
}
