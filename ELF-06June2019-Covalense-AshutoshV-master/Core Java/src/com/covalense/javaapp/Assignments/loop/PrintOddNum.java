package com.covalense.javaapp.assgn.loop;

import lombok.extern.java.Log;

@Log
public class PrintOddNum {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i % 7 == 0) {
				log.info(" " + i);
			}
			i = i + 2;
		}
	}
}
