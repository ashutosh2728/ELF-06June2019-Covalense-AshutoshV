package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(6);

		Comparator<Integer> c = (i, j) -> i.compareTo(j);
		Integer min = al.stream().min(c).get();
		Integer max = al.stream().max(c).get();

		log.info("" + min);
		log.info("" + max);

		al.stream().sorted().collect(Collectors.toList());

		al.stream().forEach(i -> log.info("" + i));
	}

}
