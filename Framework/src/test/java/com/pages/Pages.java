package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {

	Pages pf;

	WebDriver driver;

	public Pages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement usernameField;

	public WebElement usernameField() {
		return usernameField;
	}

	@FindBy(name = "password")
	WebElement passwdField;

	public WebElement passwordField() {
		return passwordField();
	}

	@FindBy(xpath = "//form[@id='login']//i[@class='fa fa-2x fa-sign-in']")
	WebElement loginField;

	public WebElement LogIn() {
		return loginField;
	}

	public Object signinField() {
		return null;
	}

	public Object verifyField() {
		// TODO Auto-generated method stub
		return null;
	}
}