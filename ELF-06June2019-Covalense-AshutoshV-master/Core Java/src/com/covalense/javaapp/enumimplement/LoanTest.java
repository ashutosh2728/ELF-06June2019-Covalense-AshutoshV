package com.covalense.javaapp.enumimplement;

import lombok.extern.java.Log;

@Log
public class LoanTest {
	public static void main(String[] args) {
		Loan t = Loan.HOME;
		int constValue = t.getValue();
		log.info("Value of home loan is " + constValue);
		Loan a = Loan.CAR;
		int constValue1 = a.getValue();
		log.info("Value of car loan is " + constValue1);

	}
}
