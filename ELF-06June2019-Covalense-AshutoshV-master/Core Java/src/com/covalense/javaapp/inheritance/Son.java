package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Son extends Father
{
	void bike()
	{
		log.info("Modified Bike");
	}
}
