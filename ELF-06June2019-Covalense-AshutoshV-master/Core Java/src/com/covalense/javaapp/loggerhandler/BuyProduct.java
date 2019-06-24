package com.covalense.javapp.loggerhandler;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BuyProduct {
	private static final Logger loger = Logger.getLogger("BuyProduct");

	void buy() {
		
		loger.log(Level.SEVERE, "Hi its a SEVERE buy message");
		loger.log(Level.WARNING, "Hi its a WARNING buy message");
		loger.log(Level.INFO, "Hi its a INFO buy message");
		loger.log(Level.CONFIG, "Hi its a CONFIG buy message");
		loger.log(Level.FINE, "Hi its a FINE buy message");
		loger.log(Level.FINER, "Hi its a FINER buy message");
		loger.log(Level.FINEST, "Hi its a FINEST buy message");
	
	}

}
