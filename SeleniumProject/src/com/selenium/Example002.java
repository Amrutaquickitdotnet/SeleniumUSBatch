package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Example002 {

	static WebDriver driver; // Global variable

	public static void main(String[] args) {

//		/* Test Cases automation for login application

		launchBrowser();

		login();

	}

	// user defined method
	public static void launchBrowser() {

		driver = new ChromeDriver();// I would like to open chrome browser

		// WebDriver driver1= new SafariDriver();

	}

	public static void login() {
//url => https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

		driver.get("https://www.facebook.com/");

		// How to maximize the Screen resolution

		// maximisze()

		driver.manage().window().maximize();
//		driver.manage().window().minimize();

		// driver.close();

		// driver.findElement(By.id("email")).sendKeys("tester");
		WebElement username = driver.findElement(By.id("email"));// Find locator

		// username is reference variable

		username.sendKeys("test@gmail.com");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// username.clear();

//		WebElement password = driver.findElement(By.id("pass"));
//
//		password.sendKeys("test1234");

		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("test1234");

		WebElement loginButton = driver.findElement(By.name("login"));

		// loginButton.click();

		// $x by using you can verify locators
		WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
		createNewAccount.click();
	}

}
