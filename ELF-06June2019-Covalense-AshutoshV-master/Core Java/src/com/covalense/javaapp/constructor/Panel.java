package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Panel {

	Panel(int a) {
		log.info("Integer Constructor"+a);
	}

	Panel(double a) {
		log.info("double constructor"+a);
	}

}
