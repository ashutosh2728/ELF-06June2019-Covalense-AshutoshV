package com.covalense.javaapp.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.extern.java.Log;

@Log
public class Date {

	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		log.info("" + a.getDayOfMonth());
		log.info("" + a.getDayOfYear());
		log.info("" + a.getMonthValue());
		log.info("" + a.getYear());

		log.info("" + a.lengthOfYear());

		LocalDate d = LocalDate.of(1995, 2, 27);
		log.info("" + d);

		LocalDateTime b = LocalDateTime.of(1996, 06, 27, 4, 30);
		log.info("" + b);
	}

}
