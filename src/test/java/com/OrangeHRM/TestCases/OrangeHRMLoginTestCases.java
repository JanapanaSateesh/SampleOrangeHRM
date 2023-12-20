package com.OrangeHRM.TestCases;

import org.testng.annotations.Test;

import com.OrangeHRM.Pages.AddUser;
import com.OrangeHRM.Pages.LoginPage;

public class OrangeHRMLoginTestCases extends BaseCls {

	LoginPage loginpage;
	
	@Test(enabled = true, priority = 1, groups = {"smoke"})
	public void loginWithValidCredentialsTC_001() throws InterruptedException {
		 loginpage=new LoginPage(driver);
		loginpage.loginWithValidCredentials(username, password,"OrangeHRM");
	}
	
	@Test(enabled = true, priority = 2,groups = {"regression"})
	public void loginWithInValidCredentialsTC_002() throws InterruptedException {
		 loginpage=new LoginPage(driver);
		 loginpage.loginWithInValidCredentials(username, "234","Invalid credentials");
		
	}
	
	@Test(enabled = true,priority = 3,groups = {"smoke"})
	public void addUserTC_003() throws InterruptedException {
		 AddUser adduser = new AddUser(driver);
		 adduser.addUser(username,password,"SateeshM","abc@123","abc@123");
		
	}
}
