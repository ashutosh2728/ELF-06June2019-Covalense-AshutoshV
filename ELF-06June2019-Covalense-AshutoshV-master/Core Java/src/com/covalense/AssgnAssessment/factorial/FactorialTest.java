package com.covalense.assgnassessment.factorial;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class FactorialTest {
	public static void main(String[] args) {
	
	Function<Integer, Integer> factorial= (n)->{
			int fact=1;
			for(int i = 1;i<=n;i++) {
				fact=fact*i;
			}	
			return fact;
	};
	
	
	log.info(""+factorial.apply(5));
	
	
	
	}
}
