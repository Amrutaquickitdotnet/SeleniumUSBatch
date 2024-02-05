package com.selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Example007_TakeScreenshot {

	static WebDriver driver;// Declared Webdriver as Global variable

	public static void main(String[] args) throws Exception {
		launchbrowser();
	
		captureScreenshot();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com");
		driver.manage().window().maximize();
		
		
	}

	
	public static void captureScreenshot() throws Exception {
	TakesScreenshot screenshot = 	((TakesScreenshot)driver);
	
		
         File sourceFile = 	screenshot.getScreenshotAs(OutputType.FILE);// WebDriver is to take the Screenshot
         
         //Path to the location to save screenshot 
        // FileUtils.copyFile();==> Older version
         
         
         String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
         
       //  FileHandler.copy(sourceFile, new File("E:\\SeleniumClass2024\\CaptureScreenimage\\test.png"));
         
         
         FileHandler.copy(sourceFile, new File("E:\\SeleniumClass2024\\CaptureScreenimage\\test.jpg"+"."+ timestamp));
         
		
		//com.util 
	}
	
	}

