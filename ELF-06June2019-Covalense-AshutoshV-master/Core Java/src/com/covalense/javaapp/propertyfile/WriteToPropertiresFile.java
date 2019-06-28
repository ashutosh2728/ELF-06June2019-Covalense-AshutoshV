package com.covalense.javaapp.propertyfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class WriteToPropertiresFile {
	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");
			Properties p = new Properties();
			p.setProperty("CompanyName", "Covalense");
			p.setProperty("PhoneNumber", "9876543210");

			p.store(fout, "Company Details");
			log.info("Created profile");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
