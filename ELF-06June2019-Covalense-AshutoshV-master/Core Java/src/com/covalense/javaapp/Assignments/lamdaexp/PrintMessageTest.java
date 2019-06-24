package com.covalense.javaapp.assgn.lamdaexp;

import lombok.extern.java.Log;

@Log
public class PrintMessageTest {
public static void main(String[] args) {
	
	PrintMessage p =s-> {
		return s;
	};
	log.info("Hello Good Morning !!!");
}
}
