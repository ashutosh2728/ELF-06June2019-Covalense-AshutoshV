package com.covalense.javaapp.function;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class CircleArea {
	public static void main(String[] args) {
		Function<Double, Double> f = r -> 3.142 * r * r;

		double x = f.apply(5.2);
		log.info("Result : " + x);
	}
}
