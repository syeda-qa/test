package com.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pages.Pages;

public class DropDownTest {
	@Test

	public void dropDown() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// PageFactory.initElements(driver, this.);

		/*
		 * driver.get(
		 * "https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https://www.yahoo.com"
		 * ); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * //driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(
		 * "rdgftgjk");
		 * driver.findElement(By.name("username")).sendKeys("bristy_medina@yahoo.com");
		 * driver.findElement(By.xpath("//input[@id='login-signin']")).submit();
		 * 
		 */

		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
		s.selectByVisibleText("Books");
		List<WebElement> l = s.getOptions();
		System.out.println(l.size());
		//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
		 

	}

}
