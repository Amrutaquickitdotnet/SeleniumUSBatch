package com.StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

	@When("user enters {string} and {string}")
	public void user_enters_and(String uname, String pwd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pwd);
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		loginButton.click();
	}

	
	
	@When("user Logout from the application")
	public void user_logout_from_the_application() throws InterruptedException {
	
		WebElement arrow = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']/i"));
		arrow.click();
		
		Thread.sleep(2000);
		
		WebElement logoutLink = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]"));
		logoutLink.click();
		
	}
	@Then("user redirect on my home page")
	public void user_redirect_on_my_home_page() {
	   System.out.println("User Redirect on my home page");
	}

}
