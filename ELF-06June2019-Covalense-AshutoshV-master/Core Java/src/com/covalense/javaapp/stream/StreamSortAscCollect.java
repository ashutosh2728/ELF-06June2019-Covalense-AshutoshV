package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class StreamSortAscCollect {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);

		Comparator<Integer> c = (i, j) -> i.compareTo(j) * -1;

		Stream<Integer> s = al.stream().sorted(c);

		List<Integer> bl = s.collect(Collectors.toList());

		log.info("" + bl);
	}
}
