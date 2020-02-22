package com.util;

import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		Actions abc = new Actions(driver);
		WebElement AZ = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		// AZ.sendKeys(keysToSend);
		// AZ.sendKeys(Keys.ENTER);
		abc.moveToElement(AZ).moveToElement(driver.findElement(By.xpath(
				"//div[@id='nav-al-wishlist']/a[@href='/gcx/Gifts-for-Everyone/gfhz/?_encoding=UTF8&ref_=nav_wishlist_gf']/span[@class='nav-text']")))
				.click().build().perform();

	}

}
