package com.covalense.javaapp.enumimplement;

import lombok.extern.java.Log;

@Log
public class CheckString {
	public static void main(String[] args) {
		String s = "Apple";

		switch (s) {
		case "Apple":
			log.info("Its Apple");
			break;
		case "Orange":
			log.info("Its Orange");
			break;
		default:
			log.info("Its banana");
			break;
		}
	}
}
