package com.covalense.javaapp.enumimplement;

import lombok.extern.java.Log;

@Log
public class TestGender {
	public static void main(String[] args) {
		log.info("" + Gender.MALE);
		log.info("" + Gender.OTHER.ordinal());
		Gender t = Gender.FEMALE;
		switch (t) {
		case MALE:
			log.info("yes,its male ");
			break;
		case FEMALE:
			log.info("yes,its Female ");
			break;
		case OTHER:
			log.info("yes,its cross gender ");

		}
	}

}
