package com.covalense.javaapp.copy.javabean;

import lombok.extern.java.Log;

@Log
public class MyArrayClassTest {

	public static void main(String[] args) {
		MyArrayClass myArrayClass = new MyArrayClass();
		int size = 15;
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < size; i++) {
			myArrayClass.add("Value is " + i);
		}

		log.info("Removing 4th position");
		myArrayClass.remove(3);

		for (int i = 0; i < size; i++) {
			log.info("Output is " + myArrayClass.get(i));
		}

		long endTime = System.currentTimeMillis();
		log.info("Start time " + startTime * 10);
		log.info("End time " + endTime * 10);
	}
}
