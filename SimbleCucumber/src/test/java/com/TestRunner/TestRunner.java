package com.TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/simple.feature"},
		glue= {"simple_StepDef"},
		monochrome = true,
		plugin = {"pretty"}
		
		
		)
public class TestRunner {
	
	

}
