package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageBase {
	
	WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyPageTitle(String actualTitle, String expectedTitle) {
		Assert.assertEquals(actualTitle, expectedTitle);		
	}

}
