package com.util;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel_cta hero-carousel_'"));
				
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		System.out.println(ids.size());
		String parentid=it.next();
		String childid=it.next();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(childid);System.out.println(driver.getTitle());
		driver.switchTo().window(parentid); System.out.println(driver.getTitle());
				
		
	}

}
