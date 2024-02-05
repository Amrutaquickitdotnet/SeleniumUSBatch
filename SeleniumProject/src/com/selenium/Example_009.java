package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_009 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		launchbrowser();
		//selectionofRadobuttons();
		//selectionOfRadio();
		
	//	validationifradionotSelected();
		validationforisDisplayed();
	}

	public static void launchbrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement signup = driver.findElement(By.linkText("Create new account"));

		signup.click();
		
		Thread.sleep(5000);

	}

	public static void selectionofRadobuttons() {

	
//       driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
   	List<WebElement> genderList = driver.findElements(By.xpath("//input[@type='radio']/../label"));
   	
   System.out.println(genderList.size());// Returns me Count of Radio buttons
   
   for(int i=0; i<genderList.size(); i++) {
	   System.out.println(genderList.get(i).getText());
   }
	}
	
	public static void selectionOfRadio() {
		
		
	WebElement customRadioBtn =	driver.findElement(By.xpath("//input[@value='-1']"));
			customRadioBtn.click();
		
		
	}
	
	//how to perform validation to check radio button is selected or not 
//	
//	1. isSelected()=> checks whether radio button is selected or not
//			2. isDisplayed()=> checks whether a radio button is diplayed on the webpage
//			3. isEnabled=> checks radio button is enabled / not
	
	public static void validationifradionotSelected() {
		
		// validate by using isSelected()
		
		WebElement customRadioBtn =	driver.findElement(By.xpath("//input[@value='-1']"));
		boolean selectState = customRadioBtn.isSelected();
		
		// perform validation only and only if element is not selected 
		
		// cndition operator
		
		if(selectState == false) {
			
			customRadioBtn.click();
		}
		
	}
	
	
public static void validationforisDisplayed() {
		
		// validate by using isSelected()
		
		WebElement customRadioBtn =	driver.findElement(By.xpath("//input[@value='-1']"));
		boolean selectState = customRadioBtn.isDisplayed();
		System.out.println("The visibility of the radio button is :"+ selectState);
		// performing click Operation only and only if element is not selected 
		
		// cndition operator
		
		if(selectState == false) {
			
			customRadioBtn.click();
		}
		
	}
	

}
