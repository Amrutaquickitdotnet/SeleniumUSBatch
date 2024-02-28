package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example007_usingList {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		allLinks();
		
		
	}
	
	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.americangolf.eu/");
		driver.manage().window().maximize();
	}
	
	public static void allLinks() {
		
		// hyperlink is represented in html by using a tag
           List<WebElement>  alllinks =	driver.findElements(By.tagName("a"));
           
           System.out.println("Count of hyperlinks available on americangolf home page"+ alllinks.size());
           
// length => property we can use only and only in Array 
           
           // Size() when we are playing with collections
//           for(int i= 0; i<alllinks.size();  i++ ) 
//           {
//        	   
//        	   System.out.println(alllinks.get(i).getText());
//        	   
//           }
           // for each // Advanced For loop ":"
           for(WebElement testlinks :alllinks) {
        	   
        	  // System.out.println(testlinks.getAttribute("href"));
        	   System.out.println(testlinks.getText());
           }
           
           
	}

}
