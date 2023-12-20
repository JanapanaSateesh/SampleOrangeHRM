package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;

import com.OrangeHRM.Commands.CommandsOrangeHRM;
import com.OrangeHRM.Objects.OrangeHRMObjects;

public class AddUser extends CommandsOrangeHRM {

	public WebDriver driver;
	
	public AddUser(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void addUser(String username, String password, String adduserusername, String adduserpassword, String adduserconfirmpassword) throws InterruptedException {
		type(OrangeHRMObjects.username, username);
		type(OrangeHRMObjects.password, password);
		click(OrangeHRMObjects.login_button);
		Thread.sleep(5000);
		click(OrangeHRMObjects.menuitem_admin);
		Thread.sleep(5000);
		click(OrangeHRMObjects.adduser_button);
		Thread.sleep(5000);
		click(OrangeHRMObjects.userrole);
		Thread.sleep(5000);
		click(OrangeHRMObjects.selectuserrole);
		Thread.sleep(2000);
		type(OrangeHRMObjects.adduser_username, adduserusername);
		Thread.sleep(2000);
		type(OrangeHRMObjects.adduser_password, adduserpassword);
		Thread.sleep(2000);
		type(OrangeHRMObjects.adduser_confirmpassword, adduserconfirmpassword);
		Thread.sleep(2000);
		
		
		
	}
}
