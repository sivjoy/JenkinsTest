package com.baseTest;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	static Logger logger = Logger.getLogger(BaseClass.class);
	static Appender myAppender;
	
	@BeforeSuite
	public void setUp(){
		logger.setLevel(Level.ALL);  
        
        // Define Appender     
        myAppender = new ConsoleAppender(new SimpleLayout());  
  
        //myAppender.setLayout(new SimpleLayout());  
        logger.addAppender(myAppender); 
	}
}
