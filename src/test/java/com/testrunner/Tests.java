package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features ="Features",
		glue    = "com.stefdef"
		
		
		
		)





public class Tests extends AbstractTestNGCucumberTests {

}
