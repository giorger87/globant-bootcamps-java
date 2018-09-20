package com.globant.app;

import org.apache.log4j.Logger;

public class App 
{
	private static Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOGGER.info("Program is about to begin..");
    	
        System.out.println(getTestGreeting());
        
        
    }
    public static String getTestGreeting() {
    	return "Hello, im your first Maven App!";
    }
    public static String getTestGreeting2() {
    	return "Hello, this is the second greeting, Welcome!";
    }
}
