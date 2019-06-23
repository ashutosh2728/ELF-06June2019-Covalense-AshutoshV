package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

public class A {
	int i = 90;
}
@Log
class B extends A {
	int i = 60;

	void display() {
		int i = 30;
		log.info(""+i);
		log.info(""+this.i);
		log.info(""+super.i);
	}

}
