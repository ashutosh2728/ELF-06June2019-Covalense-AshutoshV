package com.covalense.assgnassessment.thread;

import lombok.extern.java.Log;

@Log
public class ThreadCreation extends Thread {
	
	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			log.info("" + i);
		}
	}

}
