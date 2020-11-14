package com.stefdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.base.Common;

import Pages.GreenPages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps  extends Common{//common is a parent class and extends is a 
                                      //keyword and steps is a child class
	
	
	GreenPages gp;
	
	@Given("^user is on greenkart homepage$")
	public void user_is_on_greenkart_homepage()  {
	    getdriver();
	    gp = PageFactory.initElements(driver, GreenPages.class);
	}

	@When("^user selects  any items$")
	public void user_selects_any_items()  {
	    gp.getAddField().click();
	}

	@When("^user clicks on add to cart$")
	public void user_clicks_on_add_to_cart()  {
		 gp.getAddField().click();
	}

	@When("^click on the shopping cart$")
	public void click_on_the_shopping_cart()  {
	   gp.getLogoField().click();
	}

	@When("^click on the procced to checkout$")
	public void click_on_the_procced_to_checkout() throws Exception   {
	    gp.getProccedField().click();
	    Thread.sleep(3000);
	
	    gp.getCodeField().sendKeys("rahulshettyacademy");
	}

	

	@When("^Click on the apply button$")
	public void click_on_the_apply_button()  {
		gp.getApplyField().click();
	   
	}

	@Then("^get the hidden text on our console successfully$")
	public void get_the_hidden_text_on_our_console_successfully()  {
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/span")).getText();
	System.out.println(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div/div/div/span")).getText());
	
	
	
	}
	
	


	

}
