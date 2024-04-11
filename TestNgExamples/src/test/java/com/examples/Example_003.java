package com.examples;

import org.testng.annotations.Test;

public class Example_003 {

	@Test(priority = 2)
	public void Launch_browser() {

		System.out.println("I am launching browser");

	}

	@Test(priority= 1)
	public void passingparameter(){
		System.out.println("I am passing parameters");
	}

	
}
