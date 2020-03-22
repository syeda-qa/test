package com.careerhack.testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = "com.careerhack.stepdef",
		tags = "@userRegistration",
		plugin = "pretty",
		monochrome=true
		)

public class TestRunnner extends AbstractTestNGCucumberTests{

}
