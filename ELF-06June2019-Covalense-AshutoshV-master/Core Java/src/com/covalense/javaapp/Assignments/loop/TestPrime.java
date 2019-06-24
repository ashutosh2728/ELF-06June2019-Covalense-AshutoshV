package com.covalense.javaapp.assgn.loop;

import lombok.extern.java.Log;

@Log
public class TestPrime {
	public static void main(String[] args) {

		int num = 22;
		boolean res = true;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				res = false;
				break;
			}
		}

		if (res)
			log.info("It is a prime number");
		else
			log.info("It is not  a prime number");
	}
}
