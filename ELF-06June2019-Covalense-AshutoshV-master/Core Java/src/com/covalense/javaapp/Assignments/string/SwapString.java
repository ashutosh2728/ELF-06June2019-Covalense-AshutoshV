package com.covalense.javaapp.assgn.string;

import lombok.extern.java.Log;

@Log
public class SwapString {
	public static void main(String[] args) {
		String s = "hoga beda hudugi nana bittu";
		String[] words = s.split("[[ ]*|[//.]]");
		String j = null;
		for (int i = 0; i < words.length - 2; i++) {
			if (i % 2 != 0) {
				words[i] = j;
				j = words[i + 2];
				words[i] = words[i + 2];
			} else {
				words[i] = words[i];
			}

		}

		for (int i = 0; i < words.length - 1; i++) {
			log.info(words[i]);
		}

	}

}
