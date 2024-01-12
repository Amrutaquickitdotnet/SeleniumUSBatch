package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_001_LaunchBrowser {

	// ctrl+Shift +F
	public static void main(String[] args) {

		WebDriver browser = new ChromeDriver();

		browser.get("https://www.google.com");

	}

}
