package com.covalense.javaapp.stringobj;

import lombok.extern.java.Log;

@Log
public class TestB {

	public static void main(String[] args) {
		String name = "Dimple";
		int size = name.length();
		log.info("Size is " + size);
	}

}
