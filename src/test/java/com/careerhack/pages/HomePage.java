package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Page Object Model - concept
	// Make a web element and actions on the element reusable
	// PageFactory - technology (Selenium Interface) to implement page object model
	
	// step 1. Locating the web element
	// step 2. performing the action
	// locating element - locators
	// (id, name, linkText, xPath, css-Selector, tag name, class name, partial
	// linkText)
	// WebElement linkRegister = driver.findElement(By.linkText("REGISTER"));
	// linkRegister.click();

	@FindBy(linkText = "REGISTER")
	WebElement linkRegister;

	public void clickRegister() {
		linkRegister.click();
	}
	

}
