package com.covalense.javaapp.wrapperclass;

import lombok.extern.java.Log;

@Log
public class Parsing {
	public static void main(String[] args) {
		String s = "123";
		String t = "123";
		int num1 = Integer.parseInt(s);
		int num2= Integer.parseInt(t);
		int sum=num1+num2;
		log.info("Sum is"+sum);
	}

}
