package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Page Object Model - concept
	// Make a web element and actions on the element reusable
	// PageFactory - technology (Selenium Interface) to implement page object model
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

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
