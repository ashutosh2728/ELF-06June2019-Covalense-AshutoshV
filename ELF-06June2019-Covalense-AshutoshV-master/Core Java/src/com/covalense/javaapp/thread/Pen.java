package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			log.info(" " + i);
			String s =getName();
			log.info(""+s);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				log.severe("Interrupted");
			}
		}
	}
}
