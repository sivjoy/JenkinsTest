package com.baseTest;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirefoxTest extends BaseClass{
	private WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		logger.setLevel(Level.ALL);  
        
        // Define Appender     
        myAppender = new ConsoleAppender(new SimpleLayout());  
  
        //myAppender.setLayout(new SimpleLayout());  
        logger.addAppender(myAppender);
		logger.info("Starting the Firefox run.");
	}
	@Test
	public void printStatement()	{
		driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
	}
	
	@AfterTest
	public void ripApart(){
		driver.close();
		logger.info("Closed the browser and stopping the program");
	}
}
