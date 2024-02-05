package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_CheckTitleOrangeHRM {

	public static void main(String[] args) {
		launchBrowser();
		
		
	}

	public static  void launchBrowser() {
		// We can not create instance of interface
		// selenium => ThoughtWorks Jason huggins
		// Selenium IDE ( Integrated Development Environment)

		// QTP => Quick Test Professional Record and Playback of GUI Element

		// Ctrl+Shift+o => To import packages
		WebDriver driver = new ChromeDriver();//

		// I would like to open chromeBrowser

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// How to check / get Title of the webpage.

		String title = driver.getTitle();

		System.out.println("Title of webpage is :" + title);

		// WebDriver driver = new ChromeDriver();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	WebElement actualheadingTitle =	driver.findElement(By.tagName("h5"));
	
	// Convert WebElement to String for comparison
	
	String actualTitle = actualheadingTitle.getText();
	
	String expectedTitle = "Login";
	
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Title is present");
	}else {
		System.out.println("Title is not there");
	}
	

	}

}
