package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FireFoxTest {

	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Initializing google on FireFox browser");
	
	
	}
	
	@Test
	public void FirefoxTestMethod() {
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");

	}
	
	@AfterTest
	public void teardown() {
		
		System.out.println("After test thread for firefox browser number is "+ Thread.currentThread());
		
		driver.close();
	}

	
}
