package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class NameArray {
	public static void main(String[] args) {
		char[] c = new char[8];
		c[0] = 'A';
		c[1] = 's';
		c[2] = 'h';
		c[3] = 'u';
		c[4] = 't';
		c[5] = 'o';
		c[6] = 's';
		c[7] = 'h';
		for (int i = 0; i < c.length; i++) {
			log.info("" + c[i]);

		}

		log.info("" + c.length);

	}

}
