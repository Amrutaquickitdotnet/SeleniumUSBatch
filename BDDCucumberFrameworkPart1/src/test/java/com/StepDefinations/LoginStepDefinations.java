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

	WebDriver driver;

	@Given("user is on home page")
	public void user_is_on_home_page() throws Exception {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.manage().window().maximize();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		loginButton.click();
	}

	@Then("message displayed  Login successfully")
	public void message_displayed_login_successfully() {
		WebElement dashboard = driver.findElement(By.xpath("//h6"));
		System.out.println(dashboard.getText());

	}

}
