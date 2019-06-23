package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

public interface A {
	String s = "Hello!!! Good Morning";

	@Log
	class C {
		public static void main(String[] args) {
			log.info("" + s);
		}

	}

}

interface B extends A {

}