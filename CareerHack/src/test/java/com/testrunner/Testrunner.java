package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		glue= "com.stepdef1"		
		)
public class Testrunner extends AbstractTestNGCucumberTests {

}
