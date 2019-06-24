package com.covalense.javaapp.assgn.string;

import lombok.extern.java.Log;

@Log
public class PrintStringRev {
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String s = "Hoga beda hudugi nana bittu";
		String[] words = s.split("[[ ]*|[//.]]");
		int i = 0;
		while (i < words.length) {
			if (i % 2 == 0) {
				r.revString(words[i] + " ");
			} else
				log.info(words[i]);

			i++;
		}
	}

}
