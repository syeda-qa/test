package com.stepdef;

//import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;


import com.common.Common;
import com.pages.Pages;
//import com.util.TestFailureScreenShot;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//@Listeners(TestFailureScreenShot.class)

public class Stepdef extends Common {

	Pages pf;

	@Given("^I am on Herokuapp login page$")
	public void i_am_on_herokuapp_login_page() {
		getdriver();
		pf = PageFactory.initElements(driver, Pages.class);

	}

	@When("^I enter \"([^\"]*)\" and click next$")
	public void i_enter_something_and_click_next(String username, String strArg1) {

		pf.usernameField().sendKeys("tomsmith");
		pf.passwordField().sendKeys("SuperSecretPassword!");
		pf.LogIn().click();
	}

	@Then("^I click next to log in$")
	public void i_click_next_to_log_in() {
	}

	@And("^I enter \"([^\"]*)\" $")
	public void i_enter_something(String password, String strArg1) {

	}
}