package com.covalense.javaapp.assgn.loop;

import lombok.extern.java.Log;

@Log
public class PrintEvenNum {
	public static void main(String[] args) {
		int i = 50;
		while (i <= 100) {
			if (i % 5 == 0) {
				log.info(" " + i);
			}
			i = i + 2;
		}
	}
}
