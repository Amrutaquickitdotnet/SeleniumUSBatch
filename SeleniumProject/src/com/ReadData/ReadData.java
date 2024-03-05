package com.ReadData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

//	// how to read data manually
//	
//	1. check the path where my file has been kept
//	2. you can open or file 
//	3. Read data from begining of line one "Character by character"
//	4. close data safefully

	public static void main(String[] args) throws Exception {

		WebDriver driver;

		String path = "E:\\SeleniumClass2024\\SeleniumProject\\src\\Utils\\config.properties";

		FileInputStream fs = new FileInputStream(path);// created object of FileInputStream

		Properties prop = new Properties();

		prop.load(fs);

		driver = new ChromeDriver();

		driver.get(prop.getProperty("Url"));

		driver.manage().window().maximize();

		Thread.sleep(4000);

		WebElement username = driver.findElement(By.xpath(prop.getProperty("Usernamebyxpath")));
		username.sendKeys(prop.getProperty("Usernamevalue"));

		WebElement password = driver.findElement(By.xpath(prop.getProperty("PasswordbyXpath")));

		password.sendKeys(prop.getProperty("Passwordvalue"));

		driver.findElement(By.xpath(prop.getProperty("loginButtonClick"))).click();

	}

}
