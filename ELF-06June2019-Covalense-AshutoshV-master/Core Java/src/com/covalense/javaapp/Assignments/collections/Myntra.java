package com.covalense.javaapp.assgn.collections;

import lombok.extern.java.Log;

@Log
public class Myntra {
	void paymentStatus()
	{
		log.info("Please wait your request is processing");
		int a[]=new int[3];
		try {
		log.severe(""+a[5]);
		log.info("Payment completed successfully");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			log.severe("Payment Failed");
		}
		
			
		
		}
}
