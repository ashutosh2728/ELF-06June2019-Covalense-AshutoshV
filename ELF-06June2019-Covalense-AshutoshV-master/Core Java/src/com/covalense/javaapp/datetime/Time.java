package com.covalense.javaapp.datetime;

import java.time.LocalTime;

import lombok.extern.java.Log;

@Log
public class Time {
	public static void main(String[] args) {
		LocalTime t = LocalTime.NOON;
		log.info("" + t);

		LocalTime t1 = LocalTime.MIDNIGHT;
		log.info("" + t1);

	}

}
