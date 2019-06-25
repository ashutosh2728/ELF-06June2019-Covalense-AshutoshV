package com.covalense.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class PencilTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Pencil p = new Pencil();

		FutureTask<Integer> f1 = new FutureTask<Integer>(p);

		Thread t = new Thread();
		t.start();

		int i = f1.get();

		log.info("Value is " + i);

	}

}
