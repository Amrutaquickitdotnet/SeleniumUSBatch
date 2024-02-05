package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Example004_FetchDropdownvalue2 {

	static WebDriver driver;// Declared Webdriver as Global variable

	public static void main(String[] args) {

		launchbrowser();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fetchdropdownvaluecountries();

	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
	}

	public static void fetchdropdownvaluecountries() {
     WebElement countryList =  driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
     countryList.click();
		
//		Select s = new Select(countryList);
//		
//		// 1. Selection of your desired country
//		
//		s.selectByVisibleText("Australia");
	}

}
