package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExamples {

	public WebDriver driver; 
	@Test(invocationCount = 10)
	public void testoneMethod() {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
	}
	
	
	
}
