package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> l = driver.findElements(By.tagName("a"));
		System.out.println(l.size());

		Actions abc = new Actions(driver);

		abc.sendKeys(Keys.PAGE_DOWN);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");

		WebElement ad = driver.findElement(By.xpath("//a[@id='nav-link-accountList']/span[2]"));
		System.out.println(ad.getText());
		ad.click();

		abc.moveToElement(ad).moveToElement(driver.findElement(By.xpath
("//div[@id='nav-al-wishlist']/a[@href='/gcx/Gifts-for-Everyone/gfhz/?_encoding=UTF8&ref_=nav_wishlist_gf']/span[@class='nav-text']"))).click().build().perform();
	}

}
