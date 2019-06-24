package com.covalense.javaapp.predicate;

import java.util.function.Predicate;

import lombok.extern.java.Log;
@Log
public class StringTest {
public static void main(String[] args) {
	Predicate<String> p = s-> s.length()>=5;
	boolean x = p.test("Ashu");
	log.info(""+x);
}
}
