package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

@Log
public class Hero extends Honda {
	void design() {
		log.info("I am a design method");
	}
}
