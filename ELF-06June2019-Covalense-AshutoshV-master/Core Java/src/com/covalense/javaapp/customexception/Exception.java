package com.covalense.javapp.customexception;

import java.io.IOException;

public class Exception extends IOException{
	private String message;

	public Exception(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
