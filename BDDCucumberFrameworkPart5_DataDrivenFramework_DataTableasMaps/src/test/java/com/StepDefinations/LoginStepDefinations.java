package com.StepDefinations;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinations {

	 static WebDriver driver;

	@Given("user is on home page")
	public void user_is_on_home_page() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@When("user enters credentials to login")
	public void user_enters_credentials_to_login(DataTable credentials) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Write code to handle data table 
		
		
		
		List<Map<String, String>> user = 	credentials.asMaps(String.class, String.class);
		
		
		for(Map<String, String>  form:user) {
			
		String uname =	form.get("username");//Object formation in data Table
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		
		String pwd =	form.get("password");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		
			 
				
			
		

		
		
	}

	@Then("successful login done")
	public void successful_login_done() {
	    System.out.println("I am on dashboard");
	}


	

}
