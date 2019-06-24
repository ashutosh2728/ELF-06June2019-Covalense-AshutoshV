package com.covalense.javaapp.function;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class NoOfCharacters {
	public static void main(String[] args) {
		Function<String, Integer> f = r -> r.length();

		double x = f.apply("Hello Good Morning");
		log.info("Result : " + x);
	}

}
