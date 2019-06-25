package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class PVR {
	synchronized void book() {
		for (int i = 0; i <= 5; i++) {
			log.info(" " + i);

			try {
				wait();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	synchronized void leave() {
		notifyAll();
	}
}
