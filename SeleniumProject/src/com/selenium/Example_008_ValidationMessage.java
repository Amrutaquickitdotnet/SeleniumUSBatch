package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_008_ValidationMessage {

	static WebDriver driver;

	public static void main(String[] args) {
		launchbrowser();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		validateTextforUsername();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}
//	<span class="oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message"
//			data-v-7b563373="" data-v-957b4417="">Required</span>

	public static void validateTextforUsername() {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dfdhfh");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String expectedResult = "Required";

		String actualResult = driver.findElement(By.xpath("//div[@class='oxd-form-row'][1]/div/div[2]/../span")).getText();

		if (expectedResult.equals(actualResult)) {

			System.out.println("Validation message appear for username");
		} else {
			System.out.println("Validation message should not match");
		}
	}

}
