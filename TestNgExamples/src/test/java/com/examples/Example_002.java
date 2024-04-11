package com.examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_002 {
  
	
	@Test
  public void testcase1() {
	  System.out.println("This is my normal Test Case");
  }
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This test will execute before every method");
		
	}
	
//	1.Openbrowser => chrome, FF, ME(Test Environment)@BeforeMethod
//	2.perform some Steps  //@Test this is my actual which i need to implement
//	3. Close browser// @AfterMethod/ @AfterTest
	
	
	@AfterTest
	public void aftermethod() {
		
		System.out.println("This test will execute after every method ");
		
	}
	
	@Test
	 public void testcase2() {
		  System.out.println("I am in Test Case 2");
	  }
}
