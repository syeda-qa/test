package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {

	public WebDriver driver;

	public PageObjectModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//input[@type='submit'])[1]")
	private WebElement submitField;

	public WebElement getSubmitField() {
		return submitField;
	}

	@FindBy (xpath = "//a[contains(text(), 'Registry')]")
	public WebElement registryField;

	public WebElement getRegistryField() {
		return registryField;
	}
	
	
	
	
	

}
