package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.careerhack.common.FlightsBase;
import com.careerhack.pages.HomePage;
import com.careerhack.pages.PageBase;
import com.careerhack.pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistration extends FlightsBase {

	// WebDriver driver;
	HomePage hp;
	RegisterPage rp;

	@Given("^I am on the application homepage$")
	public void i_am_on_the_application_homepage() {
		getDriver();
		driver.get("http://newtours.demoaut.com");
		// driver.get("http://yahoo.com");
	}

	@When("^I click on register link$")
	public void i_click_on_register_link() {
		hp = new HomePage(driver);
		hp.clickRegister();
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter(String firstName, String lastname, String phone, String email, String userName, String userPass,
			String userConPass) {
		
		rp = new RegisterPage(driver);
		rp.enterFirstName(firstName);
		rp.enterLastName(lastname);
		


		// write simple css selector: htmlTag[attribute='value']
		WebElement editPhone = driver.findElement(By.cssSelector("input[name='phone']"));
		editPhone.sendKeys(phone);

		WebElement editEmail = driver.findElement(By.cssSelector("input[id='userName']"));
		editEmail.sendKeys(email);

		WebElement editUserName = driver.findElement(By.xpath("//input[@id='email']"));
		editUserName.sendKeys(userName);

		WebElement editPass = driver.findElement(By.cssSelector("input[name='password']"));
		editPass.sendKeys(userPass);

		WebElement editConPass = driver.findElement(By.cssSelector("input[name='confirmPassword']"));
		editConPass.sendKeys(userConPass);

	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() {

		WebElement btnSubmit = driver.findElement(By.name("register"));
		btnSubmit.click();

	}

	@Then("^I find registration successful page$")
	public void i_find_registration_successful_page() {
		// testng - assert - compare actual with expected
		// expected page title "Register: Mercury Tours"
		String title = driver.getTitle();
		PageBase.verifyPageTitle(title, "Register: Mercury Tours");
		closeBrowser();
	}

}
