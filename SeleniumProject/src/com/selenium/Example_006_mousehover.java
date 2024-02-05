package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_006_mousehover {

	static WebDriver driver;
	public static void main(String[] args) {
		launchbrowser();
		mousehover();

	}
	
	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	public static void mousehover() {
       WebElement GmailLocator =		driver.findElement(By.linkText("Gmail"));
       
       // Classname variable name = new classname()
       Actions act = new Actions(driver);
       act.moveToElement(GmailLocator).build().perform();
       GmailLocator.click();
	}

}
