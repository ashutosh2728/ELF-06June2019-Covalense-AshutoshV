package com.covalense.javaapp.assgn.string;

import lombok.extern.java.Log;

@Log
public class ReverseString {
	   public void revString(String s) {
		 
		String  rev="";
		for(int i =s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		log.info(rev);
	
	   }
}
