package com.covalense.javaapp.stream;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class StreamArray {
	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4, 5 };
		Stream<Integer> s = Stream.of(a);
		s.forEach(i -> log.info("" + i));

		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5);
		s1.forEach(System.out::println);
	}
}
