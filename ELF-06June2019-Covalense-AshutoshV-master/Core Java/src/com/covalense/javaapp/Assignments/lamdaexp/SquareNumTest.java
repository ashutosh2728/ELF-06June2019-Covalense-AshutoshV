package com.covalense.javaapp.assgn.lamdaexp;

import lombok.extern.java.Log;

@Log
public class SquareNumTest {
	public static void main(String[] args) {
		SquareNumber sn = n -> {
			return n * n;
		};
		log.info("Square of a number is" + sn.squareNum(5));
	}
}
