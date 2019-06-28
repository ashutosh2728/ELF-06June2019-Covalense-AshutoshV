package com.covalense.javaapp.abstractionbrowser;

import lombok.extern.java.Log;

@Log
abstract class Google {
	void login() {
		log.info("Login Successful");
	}

	abstract void shareDocument();

}
