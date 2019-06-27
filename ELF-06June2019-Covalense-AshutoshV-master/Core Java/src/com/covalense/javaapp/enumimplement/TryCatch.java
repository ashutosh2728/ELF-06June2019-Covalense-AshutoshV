package com.covalense.javaapp.enumimplement;

import lombok.extern.java.Log;

@Log
public class TryCatch {
	public static void main(String[] args) {
		try {
			log.info("" + (10 / 0));

		} catch (ArithmeticException | NullPointerException e) {
			log.info("" + e.getMessage());
		} catch (Exception e) {
			log.info("I am general catch block");
		}
	}

}
