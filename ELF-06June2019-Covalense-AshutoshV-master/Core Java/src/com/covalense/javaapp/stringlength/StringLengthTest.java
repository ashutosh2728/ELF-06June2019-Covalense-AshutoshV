package com.covalense.javaapp.lamdaexp.stringlength;

import lombok.extern.java.Log;

@Log
public class StringLengthTest {

	public static void main(String[] args) {
		StringLength sl = s -> {
			return s.length();
		};
		log.info("Length of string is "+sl.stringLength("ashutosh verma"));
	}
	
}
