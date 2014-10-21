package com.baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenChromeTest extends BaseClass{
	private WebDriver driver;
	@BeforeTest
	public void setUp(){
		logger.info("Starting the run for chrome.");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
	}
	@Test
	public void printStatement() throws InterruptedException	{
		driver = new ChromeDriver();
		logger.info("Started Chrome Browser");
		driver.get("http://www.bing.com");
		logger.info("Logged into bing page.");
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void ripApart(){
		driver.close();
		logger.info("Closed the Chrome browser and stopping the program");
	}


}
