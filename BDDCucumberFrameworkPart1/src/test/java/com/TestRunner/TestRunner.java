package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

// I want to include features

@CucumberOptions(
		
		features = "E:\\SeleniumClass2024\\BDDCucumberFrameworkPart1\\Features\\Login.feature",
		
		glue= {"com.StepDefinations"}
		
		
		
		
	
		
		
		
		
		)


public class TestRunner {

}
