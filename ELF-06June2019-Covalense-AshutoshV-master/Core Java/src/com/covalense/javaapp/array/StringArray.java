package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class StringArray {
	public static void main(String[] args) {
		String[] s = new String[4];
		s[0] = "mercury";
		s[1] = "Venus";
		s[2] = "Earth";
		s[3] = "mars";

		for (int i = 0; i < s.length; i++) {
			log.info("" + s[i]);

		}
		log.info("" + s.length);

	}

}
