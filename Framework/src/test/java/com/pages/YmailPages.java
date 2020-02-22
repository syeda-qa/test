package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YmailPages {
	YmailPages ym;
	WebDriver driver;

	public YmailPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement usernameField;

	public WebElement getUsernameField() {
		return usernameField;
	}

	@FindBy(xpath = "//a[@id='header-signin-link']")
	WebElement signinField;

	public WebElement getSigninField() {
		return signinField;
	}

	@FindBy(xpath = "//input[@id='login-passwd']")
	WebElement passwordField;

	public WebElement getPasswordField() {
		return passwordField;
	}

	@FindBy(name = "verifyPassword")
	WebElement verifyField;

	public WebElement getVerifyField() {
		return verifyField;
	}

	@FindBy(xpath = "//input[@id='login-signin']")
	WebElement nextField;

	public WebElement getNextField() {
		return nextField;
	}

	@FindBy(xpath = "//button[@id='login-signin']")
	WebElement loginField;

	public WebElement getLoginField() {
		return loginField;
	}
	
	
}
