package com.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
	if(!(driver instanceof WebDriver))
	{
	
	System.setProperty("webdriver.chrome.driver", AppConfigProperties.getApplicationProperties().getProperty("webdriver.chrome.driver").trim());
	driver=new ChromeDriver();
    //driver.get(AppConfigProperties.getApplicationProperties().getProperty("app.URL"));
    
    
	}
	return driver;
	}
}


