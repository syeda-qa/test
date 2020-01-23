package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		Actions ac=new Actions(driver);
		 WebElement s= driver.findElement(By.xpath("(//span[contains(text(),'Account & Lists')])[1]"));
		 
		 
	
	}

}
