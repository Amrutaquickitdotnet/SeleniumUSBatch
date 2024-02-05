package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.internal.JavaVersionSpecific;

public class Example_11_CheckboxAutomation {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		launchbrowser();
		
		selectionofCheckbox();
		
	}

	public static void launchbrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.javascripttutorial.net/javascript-dom/javascript-checkbox/");
		driver.manage().window().maximize();

		

	}

	
	public static void selectionofCheckbox() {
		
	
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)", "");
		
	WebElement redcolor=	driver.findElement(By.id("c1"));
	redcolor.click();
	}
	

}
