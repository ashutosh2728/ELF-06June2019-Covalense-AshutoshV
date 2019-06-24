package com.covalense.javaapp.assgn.string;

import lombok.extern.java.Log;

@Log
public class Database1 {
	void displayResult(Product p) {
		log.info("Name : " + p.prodName);
		log.info("ProdId : " + p.prodId);
		log.info("Product Cost : " + p.cost);

	}

}
