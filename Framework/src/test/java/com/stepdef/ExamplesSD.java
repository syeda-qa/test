package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.common.Ymail;
import com.pages.GmailPages;
import com.pages.YmailPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExamplesSD extends Ymail {
	GmailPages gm;

	@Given("^user is on homepage$")
	public void user_is_on_homepage() {
		// Write code here that turns the phrase above into concrete actions

		getdriver();
		gm = PageFactory.initElements(driver, GmailPages.class);
	}

	@When("^user clicks on signon button$")
	public void user_clicks_on_signon_button() {
		// Write code here that turns the phrase above into concrete actions
		// ym.getSigninField().click();
		gm.getGmailsignField().click();
	}

	@When("^user  puts \"([^\"]*)\" and clicks next button$")
	public void user_puts_and_clicks_next_button(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		// ym.getUsernameField().sendKeys(arg1);
		// ym.getNextField().submit();
		gm.getEmailField().sendKeys(arg1);
		gm.getSignnextField().click();
	}

	@When("^user inputs \"([^\"]*)\" and clicks on submit button$")
	public void user_inputs_and_clicks_on_submit_button(String arg2) {
		// Write code here that turns the phrase above into concrete actions
		// ym.getPasswordField().sendKeys(arg2);
		// ym.getLoginField().submit();
		gm.getPwField().sendKeys(arg2);
		gm.getLogField().click();
	}

	@Then("^user will be logged in$")
	public void user_will_be_logged_in() {
		// Write code here that turns the phrase above into concrete actions
	}

}