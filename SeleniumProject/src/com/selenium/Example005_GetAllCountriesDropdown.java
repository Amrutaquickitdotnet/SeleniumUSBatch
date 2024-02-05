package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example005_GetAllCountriesDropdown {

	static WebDriver driver;// Declared Webdriver as Global variable

	public static void main(String[] args) {
		launchbrowser();
		getAllCountriesList();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		driver.manage().window().maximize();
	}

	public static void getAllCountriesList() {

		WebElement countryList = driver.findElement(By.name("Country"));
		// List (Display) all countries from dropdown.

		// 1 st Scenario => Get the count of All countries listed inside dropdown
		// 2nd Scenario: print all names of countries on console panel

//		List<WebElement> countriesList =	driver.findElements(By.name("Country"));
//		
//		int countofCountries = countriesList.size();
//		System.out.println(countofCountries);
		Select s = new Select(countryList);
		

		WebElement selectionofFirstitem = s.getFirstSelectedOption();
		System.out.println("Selection of first items in the list :" + selectionofFirstitem.getText());
		List<WebElement> allcountries = s.getOptions();// will provides all the options text

		// for each

		for (WebElement countriesList : allcountries) {

			System.out.println(countriesList.getText());
		}

	}

}
