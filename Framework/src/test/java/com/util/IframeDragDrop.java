package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class IframeDragDrop {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(), 'Droppable')]")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions ac = new Actions (driver);
		ac.sendKeys(Keys.ENTER); //keyboard handling
		ac.sendKeys(Keys.chord(Keys.SHIFT,Keys.ALT));
		
		WebElement drag = driver.findElement(By.xpath("//*[contains (text(), 'Drag me to my target')"));
		WebElement drop = driver.findElement(By.xpath("//#[@id='droppablle']"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		
		ScreenShot.screenS(driver, "fhg");
		Assert.assertEquals(driver.getTitle(), "Droppable | jQuery UI");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
