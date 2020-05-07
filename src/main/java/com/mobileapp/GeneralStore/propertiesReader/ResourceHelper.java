package com.mobileapp.GeneralStore.propertiesReader;

public class ResourceHelper {

		
		public static String getresourcePath(String path) {
			
			String basepath = System.getProperty("user.dir");
			
			return basepath+path;
		}


	}


