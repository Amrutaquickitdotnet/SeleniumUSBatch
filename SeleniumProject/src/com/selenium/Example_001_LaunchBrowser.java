package com.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_001_LaunchBrowser {

	// ctrl+Shift +F
	public static void main(String[] args) {

		WebDriver browser = new ChromeDriver();
// get the URL of the application in 2 ways 
		// by using get() method
		// By using navigate. To()

//	browser.get("https://www.google.com");

		browser.navigate().to("https://www.google.com");

		browser.navigate().to("https://www.amazon.com");

		browser.navigate().back();

		// browser.manage().timeouts().implicitlyWait(Duration.ofMillis(3));// implicit
		// wait in selenium

		browser.navigate().forward();

		// close browser

		browser.close();

		// quit => will close all the window tabs which already opened by browser
		// close => focusing on current active window tab

	}

}
// Explicit Wait in java
//try {
//	Thread.sleep(3000);// to wait browser for 3 seconds  3000ms = 3 s
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}