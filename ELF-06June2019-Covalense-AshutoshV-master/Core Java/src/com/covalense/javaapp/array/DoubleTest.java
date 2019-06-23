package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class DoubleTest {
public static void main(String[] args) {
	double[] d = new double[4];
	d[0]=1.1;
	d[1]=1.4;
	d[2]=1.5;
	d[3]=1.9;
	for(int i =0 ; i<d.length;i++)
	{
		log.info("" + d[i]);
	}
}
}
