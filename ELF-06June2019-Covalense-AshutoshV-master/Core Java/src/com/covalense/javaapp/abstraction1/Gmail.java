package com.covalense.javaapp.abstraction1;

import lombok.extern.java.Log;

@Log
public class Gmail extends Google {
	public void shareDocument() {
		log.info("Shared document upto 25 mb");
	}
}
