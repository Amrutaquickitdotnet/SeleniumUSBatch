package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_008_RadioButton {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		launchbrowser();
		selectionofRadioButton();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get(
				"https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		driver.manage().window().maximize();

	}

	public static void selectionofRadioButton() {

		List<WebElement> radios = driver.findElements(By.name("Student 2 reading_proficiency"));

// 1st Test Case Scenario: To get Count of All radio buttons 

		System.out.println("Total number of Radio buttons:" + " " + radios.size());

		// To check radio button property "Checked"

		System.out.println(radios.get(0).getAttribute("checked"));// 0

		System.out.println(radios.get(1).getAttribute("checked"));// 1
		System.out.println(radios.get(2).getAttribute("checked"));// 2
		
                
		
	           // System.out.println(radios.get(0).getAttribute("value"));
		
		

		
		
		radios.get(1).click();
		
		
		List<WebElement> allRadios =	driver.findElements(By.xpath("//input[@type ='radio']"));
		
		for(WebElement radiosL : allRadios) {
			System.out.println(radiosL.getAttribute("value"));
		}

		System.out.println("After Selection");
		System.out.println(radios.get(0).getAttribute("checked"));// 0

		System.out.println(radios.get(1).getAttribute("checked"));// 1
		System.out.println(radios.get(2).getAttribute("checked"));// 2
		
		
		//Third Scenario to check or getText for Radio button
		
		
		

	}
}
