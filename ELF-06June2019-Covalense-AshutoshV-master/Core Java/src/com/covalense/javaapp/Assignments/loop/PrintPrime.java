package com.covalense.javaapp.assgn.loop;

import lombok.extern.java.Log;

@Log
public class PrintPrime {
	public static void main(String[] args) {
		Prime p = new Prime();
		for (int i = 1; i <= 100; i++) {
			boolean res = p.isPrime(i);
			if (res) {
				log.info(" " + i);
			}
		}

	}

}

class Prime {
	boolean isPrime(int n) {
		boolean res = true;
		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				res = false;
				break;
			}
		}
		return res;
	}
}