package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Example003_FetchDropdownValue {

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
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		driver.manage().window().maximize();
	}

	public static void fetchdropdownvaluecountries() {
     WebElement countryList =  driver.findElement(By.id("Form_getForm_Country"));
		
		Select mycountry = new Select(countryList);
		
		// 1. Selection of your desired country
		
		//select.selectByVisibleText("Bahrain");
		
		// SelectByVisibleText()
		//SelectByValue
		//SelectByIndex
		//If you want to deselect the selected text 
		//deselectByVisibleText
		//deselectByValue
		//deselectyIndex
		mycountry.selectByValue("Angola");
		
		mycountry.selectByIndex(1);
		
		//mycountry.deselectByValue("Angola");
		
	}

}
