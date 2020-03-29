package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends PageBase{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	/*
	 * WebElement editFirstName = driver.findElement(By.name("firstName"));
	 * editFirstName.sendKeys(firstName);
	 * 
	 * // writing simple xpath: //htmlTag[@attribute='value'] WebElement
	 * editLastName = driver.findElement(By.xpath("//input[@name='lastName']"));
	 * editLastName.sendKeys(lastname);
	 */

	@FindBy(name = "firstName")
	WebElement editFirstName;

	public void enterFirstName(String firstName) {
		editFirstName.sendKeys(firstName);
	}
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement editLastName;
	
	public void enterLastName(String lastName) {
		editLastName.sendKeys(lastName);
	}

}
