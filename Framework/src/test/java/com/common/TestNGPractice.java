package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	WebDriver driver;

	@BeforeTest
	public void getdriver() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void testOne() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'\'Hello, Sign in')]")).click();

		Thread.sleep(2000);
	}

	@AfterTest
	public void end() {
		driver.quit();
	}

}
