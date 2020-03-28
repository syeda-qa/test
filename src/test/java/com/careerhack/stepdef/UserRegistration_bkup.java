package com.careerhack.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegistration_bkup {
/*
	WebDriver driver;

	@Given("^I am on the application homepage$")
	public void i_am_on_the_application_homepage() {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^I click on register link$")
	public void i_click_on_register_link() {
		//step 1. Locating the web element
		//step 2. performing the action
		//locating element - locators 
		//(id, name, linkText, xPath, css-Selector, tag name, class name, partial linkText)
		WebElement linkRegister = driver.findElement(By.linkText("REGISTER"));
		linkRegister.click();
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter(String firstName, String lastname, String phone, String email, String userName, String userPass,
			String userConPass) {
		
		WebElement editFirstName = driver.findElement(By.name("firstName"));
		editFirstName.sendKeys(firstName);
		
		//writing simple xpath: //htmlTag[@attribute='value']
		WebElement editLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		editLastName.sendKeys(lastname);
		
		//write simple css selector: htmlTag[attribute='value']
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
		//testng - assert - compare actual with expected
		//expected page title "Register: Mercury Tours"
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
		driver.close(); //closes the active browser
		//driver.quit(); //closes all the browser
	}
*/
}
