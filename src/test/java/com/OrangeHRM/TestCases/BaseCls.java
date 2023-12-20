package com.OrangeHRM.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.OrangeHRM.Utilities.ReadConfig;

public class BaseCls {

	public static WebDriver driver;
	public static String url;
	public static String username;
	public static String password;
	
	
	
	@BeforeMethod
	public void startUp() throws InterruptedException, IOException {
		ReadConfig readconfig= new ReadConfig();
		 url=readconfig.url();
		 username=readconfig.uname();
		 password=readconfig.pwd();
		
		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//This is from git hub
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	
	public void testMethod1() {
		System.out.println("This is for github pusing the code into branch");
	}
}
