package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages {
 WebDriver driver; 
 public Pages (WebDriver driver) {
	 this.driver= driver;
	 
	 System.out.println(driver.getTitle());
 }
}
