package com.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowntest {
	@Test
	
	public void dropDown() {
		
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		
		Select s=new Select(driver.findElement(By.id("searchDropdownBox")));
		s.selectByVisibleText("Deals");
		
	List<WebElement>l=s.getOptions();
	System.out.println(l.size());
		
		
			
				
		
	}

}
