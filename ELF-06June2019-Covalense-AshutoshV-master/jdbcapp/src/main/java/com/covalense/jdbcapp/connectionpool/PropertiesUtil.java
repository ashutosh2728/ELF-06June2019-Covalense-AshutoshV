package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtil {
	private static PropertiesUtil propRef = null;
	Properties properties = null;

	private PropertiesUtil() throws Exception {
		FileInputStream fin = new FileInputStream("data.properties");
		properties = new Properties();
		properties.load(fin);
	}

	public static PropertiesUtil getPropertyUtil() throws Exception {
		if (propRef == null) {
			propRef = new PropertiesUtil();
		}
		return propRef;
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

}
