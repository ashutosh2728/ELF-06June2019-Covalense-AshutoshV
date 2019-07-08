package com.covalense.assgnassessment.simpleinterest;

import java.util.function.Function;

import lombok.extern.java.Log;
@Log
public class SimpleInterestTest {
	public static void main(String[] args) {
		
		Function<SimpleInterest, Double> function =(i)-> {
		return (i.principal* i.rate*i.time)/100;
		};
		
		log.info(""+function.apply(new SimpleInterest(16666, 8.2, 3)));
	}

}
