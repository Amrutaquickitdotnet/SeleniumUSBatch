package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTest {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Initializing google on Chrome browser");
	
	
	}
	
	@Test
	public void ChromeTestMethod() {
		driver = new ChromeDriver();

		driver.get("https://www.google.com");

	}
	
	@AfterTest
	public void teardown() {
		
		System.out.println("After test thread number for chrome browser is "+ Thread.currentThread().threadId());
		
		driver.close();
	}

}
