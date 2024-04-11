package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	public WebDriver driver;

	
	@Test
	public void FirefoxTest() {
		driver = new FirefoxDriver();

		driver.get("https://www.google.com");

	}

	@Test
	public void chromeTest() {

		driver = new ChromeDriver();

		driver.get("https://www.google.com");
	}
}
