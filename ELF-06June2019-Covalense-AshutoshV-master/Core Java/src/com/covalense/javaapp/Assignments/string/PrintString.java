package com.covalense.javaapp.assgn.string;

import lombok.extern.java.Log;

@Log
public class PrintString {
	public static void main(String[] args) {
		String s = "how are you doing";
		String[] words = s.split("[[ ]*|[//.]]");
		for (int i = 0; i <= words.length; i++) {
			log.info(words[i]);
			log.info("" + words[i].length());
		}
	}

}
