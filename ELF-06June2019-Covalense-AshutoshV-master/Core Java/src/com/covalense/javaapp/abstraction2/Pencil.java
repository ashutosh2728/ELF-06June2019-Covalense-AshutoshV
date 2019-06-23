package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

@Log
abstract class Pencil {
	void write(){
		log.info("Write Method");
	}
abstract	void draw();
	abstract void color();
	

}
