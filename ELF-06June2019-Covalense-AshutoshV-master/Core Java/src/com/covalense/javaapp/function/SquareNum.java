package com.covalense.javaapp.function;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class SquareNum {
	public static void main(String[] args) {
		Function<Integer, Integer> f = r -> r * r;

		double x = f.apply(5);
		log.info("Result : " + x);

	}
}
