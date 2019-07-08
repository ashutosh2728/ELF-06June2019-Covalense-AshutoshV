package com.covalense.assgnassessment.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolCreation {
	public static void main(String[] args) {
		ThreadCreation thread1 = new ThreadCreation();
		ThreadCreation thread2 = new ThreadCreation();
		ThreadCreation thread3 = new ThreadCreation();
		ThreadCreation thread4 = new ThreadCreation();
		ThreadCreation thread5 = new ThreadCreation();

		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.execute(thread1);
		pool.execute(thread2);
		pool.execute(thread3);
		pool.execute(thread4);
		pool.execute(thread5);

		pool.shutdown();
	}

}
