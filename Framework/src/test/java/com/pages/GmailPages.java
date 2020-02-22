package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPages {
	GmailPages gm;
	WebDriver driver;

	public GmailPages(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@id='gb_70']")
	WebElement gmailsignField;

	public WebElement getGmailsignField() {
		return gmailsignField;
	}

	@FindBy(xpath = "//div[@class='BHzsHc'][1]")
	WebElement accountField;

	public WebElement getAccountField() {
		return accountField;
	}
	
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement emailField;

	public WebElement getEmailField() {
		return emailField;
	}
	@FindBy(xpath = "//span[@class='RveJvd snByac']")
	WebElement signnextField;

	public WebElement getSignnextField() {
		return signnextField;
	}
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pwField;

	public WebElement getPwField() {
		return pwField;
	}
	
	/*
	 * @FindBy(xpath = "//span[@class='CwaK9'][1]") WebElement logField;
	 */
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement logField;

	public WebElement getLogField() {
		return logField;
	}
	
	
	
	
}
