package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

// I want to include features

@CucumberOptions(
		
		features = "E:\\SeleniumClass2024\\BDDCucumberFrameworkPart3_DataDrivenFramework_WithExampleKeyword\\Features\\Login.feature",
		
		glue= {"com.StepDefinations"},
		
		plugin = {"pretty","html:target/cucumber-reports"}
		
		
		
		
	
		
		
		
		
		)


public class TestRunner {

}
