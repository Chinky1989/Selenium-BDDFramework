package com.cucumberFramework.helper;

import org.apache.log4j.PropertyConfigurator;

public class Logger {

	private static boolean root=false;
	
	public static org.apache.log4j.Logger getLogger(Class cls){
		if(root){
			return org.apache.log4j.Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return org.apache.log4j.Logger.getLogger(cls);
	}

}
