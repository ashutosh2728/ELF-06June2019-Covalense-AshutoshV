package com.covalense.javaapp.assgn.lamdaexp;

import lombok.extern.java.Log;

@Log
public class PrintNumTest {
public static void main(String[] args) {
	PrintNumber p = n -> {
		for(int i=0;i<=n;i++) {
			log.info(i+" ");
		}
			
	};
	p.print(10);
}
}
