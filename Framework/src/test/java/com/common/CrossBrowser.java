package com.common;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@Parameters("Browser")
	@Test

	public void getBrowser(String BrowserName) {
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}  
		
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Actions ac = new Actions(driver);

		//WebElement accountList = driver.findElement(By.xpath("(//span[contains (text(), 'Account & Lists')])[1]"));

		//WebElement weddingList = driver.findElement(By.xpath("//span[contains (text(), 'Wedding Registry')]"));

		//ac.moveToElement(accountList).moveToElement(weddingList).click().build().perform();
	}

}
