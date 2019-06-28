package com.covalense.javaapp.propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class ReadFromPropertiesFile {
	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties p = new Properties();
			p.load(fin);

			String phone = p.getProperty("PhoneNumber");
			String name = p.getProperty("CompanyName");
			log.info("" + phone);
			log.info("" + name);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
