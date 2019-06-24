package com.covalense.javaapp.sortarray;

import lombok.extern.java.Log;

@Log
public class PrintArray {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		double b[]= {1.2,2.3,3.4,4.5,5.6};
		String s[]= {"ashu","babloo","Prakash","jatin"};
		for(int r : a) {
			log.info(r+" ");
		}
		for(double r : b) {
			log.info(r+" ");
		}
		for(String r : s) {
			log.info(r+" ");
		}
	}

}
