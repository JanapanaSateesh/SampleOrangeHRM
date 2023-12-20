package com.OrangeHRM.Commands;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommandsOrangeHRM {

	public WebDriver driver;
	public final static Logger logger = LogManager.getLogger("rootLogger");
	
	public CommandsOrangeHRM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void type(By byLocator, String value) throws InterruptedException {
		WebElement ele=driver.findElement(byLocator);
		Thread.sleep(2000);
		ele.sendKeys(value);
		logger.info("Enter the value :"+value+" in : "+ byLocator);
		
	}
	
	public void click(By byLocator) throws InterruptedException {
		WebElement ele= driver.findElement(byLocator);
		Thread.sleep(4000);
		ele.click();
		logger.info("clicked on locator :"+ byLocator);
	}
	
	public String getTitle() {
		String actualtitle= driver.getTitle();
		System.out.println("Actual Title: "+actualtitle);
		return actualtitle;
	}
	
	public String getUIValue(By byLocator) throws InterruptedException {
		Thread.sleep(3000);
		String msg=driver.findElement(byLocator).getText();
		System.out.println("Actual UI Value: "+msg);
		return msg;
	}
	
	public void validate(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}
}
