package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Mouse implements Runnable {
	String name;

	public Mouse(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		log.info(name + "started");
		for (int i = 0; i <= 5; i++) {
			log.info("NUM" + i);

		}
		log.info(name + "Ending");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			log.info("Handling InterruptedException");
		}
	}
}
