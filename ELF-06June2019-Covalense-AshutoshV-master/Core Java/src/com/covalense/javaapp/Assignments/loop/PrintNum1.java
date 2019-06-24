package com.covalense.javaapp.assgn.loop;

import lombok.extern.java.Log;

@Log
public class PrintNum1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i > 0; i--) {
			log.info(" " + i);
		}
	}

}
