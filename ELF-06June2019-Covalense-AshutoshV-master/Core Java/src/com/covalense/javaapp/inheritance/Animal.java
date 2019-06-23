package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Animal {
	void eat() {
		log.info("Run");
	}

}
@Log
class Lion extends Animal {
	void run() {
		log.info("Run");
	}
}

class Goat extends Lion {
	void milk() {

	}

}
