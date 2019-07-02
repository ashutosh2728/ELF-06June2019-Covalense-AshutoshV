package com.covalense.javapp.functions;

public class Percentage {
	static double perc(int marks,int total) {
		double p = (marks*100.0/total);
		return p;
		
	}

	public static void main(String[] args) {
		System.out.println("Percentage is "+ perc(400,500));
	}

}
