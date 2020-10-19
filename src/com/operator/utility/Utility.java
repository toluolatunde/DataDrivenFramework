package com.operator.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	
	
	public static Object fetchProperty(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		//property.get(key);
		property.get(key);
		return property.get(key);
		
	}
	
	public static String fetchLocator(String key ) throws IOException {

		FileInputStream file = new FileInputStream("./Config/Locators.properties");
		Properties property = new Properties();
		property.load(file);
		return 	property.get(key).toString();
	}

}
