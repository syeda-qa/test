package com.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple {
	
	@Test
	 public void multiple() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("Bangla");
		List <WebElement> options = driver.findElements(By.xpath("//*[@id=\"ui-id-57\"]"));
		//driver.findElement(By.xpath("//*[@id=\"ui-id-57\"]");
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("Bangladesh")) {
				option.click();
				break;
		
		
			}	
		
		
	}

}
}