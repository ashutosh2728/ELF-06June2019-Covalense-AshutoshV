package com.covalense.javapp.functions;

public class ComposeMail {

	public static void main(String[] args) {
		Mail m = new Mail();
		m.cc="Resume";
		m.from="Ashutosh Verma";
		m.to="Praditya";
		
		System.out.println("From :" +m.from);

	}

}
	
class Mail {
	String to;
	String from;
	String cc;
	
	void send() {
		System.out.println("Mail send");
	}
	void attachment() {
		System.out.println("File attached");
	}
	
}
