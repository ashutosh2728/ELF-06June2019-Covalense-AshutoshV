package com.covalense.javapp.customexception;

public class InvalidNameException extends RuntimeException {

	private String message;

	public InvalidNameException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

}
