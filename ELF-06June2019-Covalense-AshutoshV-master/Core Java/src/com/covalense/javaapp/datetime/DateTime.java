package com.covalense.javaapp.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.java.Log;

@Log
public class DateTime {
	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		LocalDate b = LocalDate.of(1996, 6, 27);

		Period c = Period.between(a, b);
		log.info("" + c);
		log.info(" " + c.getYears());
		log.info(" " + c.getMonths());
		log.info(" " + c.getDays());

		LocalDate dead = b.plusYears(60);
		log.info("" + dead);

		ZoneId t = ZoneId.of("Australia/Sydney");
		ZonedDateTime ze = ZonedDateTime.now();
		log.info("" + ze);
	}
}
