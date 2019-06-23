package com.covalense.javaapp.abstraction2;

import lombok.extern.java.Log;

@Log
public abstract class Pen extends Pencil {

	void draw() {
    log.info("Draw Method");

	}
}
