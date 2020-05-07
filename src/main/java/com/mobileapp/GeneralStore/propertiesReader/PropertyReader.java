package com.mobileapp.GeneralStore.propertiesReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;





public class PropertyReader {
	public static FileInputStream file;
	public static Properties OR;

	public PropertyReader() {

		try {
			String filepath = ResourceHelper.getresourcePath("\\src\\main\\resources\\configfile\\config.properties");

			file = new FileInputStream(new File(filepath));
			OR = new Properties();
			OR.load(file);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	/*
	public int getImpliciteWait() {
		return Integer.parseInt(OR.getProperty("implicitwait"));
	}

	public int getExplicitWait() {

		return Integer.parseInt(OR.getProperty("explicitwait"));
	}

	public int getPageLoadTime() {
		return Integer.parseInt(OR.getProperty("pageloadtime"));
	}


	public String getUrl() {

		System.out.println(OR.getProperty("applicationUrl"));
		return OR.getProperty("applicationUrl");
	}

	public String gerUserName() {
		return OR.getProperty("username");
	}

	public String getPassword() {
		return OR.getProperty("password");

	}
	
	public String getProviderUserName() {
		return OR.getProperty("providerUsername");
	}
	public String getProviderPassword() {
	return OR.getProperty("providerPassword");
	}
	
	public String getLocation()
	{
		return OR.getProperty("location");	
	}
	public String getProvider()
	{
		return OR.getProperty("provider");	
	}
	public String getDate() {
		return OR.getProperty("date");
		
	} */
}
