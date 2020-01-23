package com.stepdef1;

import com.common.Common;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Common {

	

    @Given("^I am on my newtours homepages$")
    public void i_am_on_my_newtours_homepages()  {
    	getdriver();
    }

    @When("^I put my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_put_my_something_and_something(String username, String password, String strArg1) {
      
    }

    @When("^I put my valid user name and invalid password$")
    public void i_put_my_valid_user_name_and_invalid_password(){
      
    }

    @Then("^I click login$")
    public void i_click_login(){
    }
}