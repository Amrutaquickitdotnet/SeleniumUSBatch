package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

// I want to include features

@CucumberOptions(
		
		features = "E:\\SeleniumClass2024\\BDDCucumberFrameworkPart2_DataDrivenFramework_WithoutExample\\Features\\Login.feature",
		
		glue= {"com.StepDefinations"}
		
		
		
		
	
		
		
		
		
		)


public class TestRunner {

}
