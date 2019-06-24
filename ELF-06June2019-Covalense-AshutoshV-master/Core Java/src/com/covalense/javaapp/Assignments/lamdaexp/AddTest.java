package com.covalense.javaapp.assgn.lamdaexp;

import lombok.extern.java.Log;

@Log
public class AddTest {

	public static void main(String[] args) {
		Add s=(a,b)->a+b;
		int i =s.add(5, 1);
		log.info(""+i);
	}

}
