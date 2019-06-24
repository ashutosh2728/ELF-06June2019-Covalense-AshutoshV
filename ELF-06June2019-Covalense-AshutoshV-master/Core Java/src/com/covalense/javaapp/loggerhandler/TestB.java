package com.covalense.javapp.loggerhandler;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestB {
	private static final Logger loger = Logger.getLogger("Flipcart");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);

		try {
			FileHandler fh = new FileHandler("myLogData.log", true);
			fh.setLevel(Level.SEVERE);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);

			loger.log(Level.SEVERE, "Hi its a SEVERE message");
			loger.log(Level.WARNING, "Hi its a WARNING message");
			loger.log(Level.INFO, "Hi its a INFO message");
			loger.log(Level.CONFIG, "Hi its a CONFIG message");
			loger.log(Level.FINE, "Hi its a FINE message");
			loger.log(Level.FINER, "Hi its a FINER message");
			loger.log(Level.FINEST, "Hi its a FINEST message");

			BuyProduct b = new BuyProduct();
			b.buy();
			System.out.println("done");

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
