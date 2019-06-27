package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class OddNumber {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);
		List<Integer> x = al.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		log.info("" + x);

		Predicate<Integer> intPredicate = i -> i % 3 == 0;
		List<Integer> y = al.stream().filter(intPredicate).collect(Collectors.toList());
		log.info("" + y);

		List<Integer> z = al.stream().map(i -> i * 2).collect(Collectors.toList());
		log.info("" + z);
	}

}
