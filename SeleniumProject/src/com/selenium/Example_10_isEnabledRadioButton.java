package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_10_isEnabledRadioButton {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		launchbrowser();
		
		checkRadioEnabled();
		
		checkRadioforDisabled();
		
	}

	public static void launchbrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.plus2net.com/jquery/msg-demo/radio6.php");
		driver.manage().window().maximize();

		

	}

	
	public static void checkRadioEnabled() {
		
	WebElement enablemode = 	driver.findElement(By.xpath("//input[@value='choice1']"));
	
	
		boolean selectstate = enablemode.isEnabled();
		System.out.println("Visibility of Radio button for Photoshop :"+ selectstate);
	}
	
	
	
public static void checkRadioforDisabled() {
		
	WebElement disabledMode =	driver.findElement(By.id("opt1"));
	
	boolean selectstate = disabledMode.isEnabled();
	System.out.println("Visibility of Radio button for Photoshop :"+ selectstate);
	}
	

}
