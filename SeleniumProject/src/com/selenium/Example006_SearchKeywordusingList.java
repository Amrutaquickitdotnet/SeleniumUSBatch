package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example006_SearchKeywordusingList {

	static WebDriver driver;// Declared Webdriver as Global variable

	public static void main(String[] args) {
		launchbrowser();
		serachKeyword();

	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com");
		driver.manage().window().maximize();
	}

	public static void serachKeyword() {

		WebElement serachKeyword = driver
				.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
		serachKeyword.sendKeys("heart");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> serachList = driver.findElements(By.xpath("//div[@class='c-omni-suggestion-item']"));
		
		if (serachList.size() > 0) {
			//serachList.get(0).click();
		}
		for (WebElement doctorList : serachList) {

			System.out.println(doctorList.getText());

		}

	}
}
