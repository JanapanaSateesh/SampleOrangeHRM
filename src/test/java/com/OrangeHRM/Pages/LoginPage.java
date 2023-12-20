package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;

import com.OrangeHRM.Commands.CommandsOrangeHRM;
import com.OrangeHRM.Objects.OrangeHRMObjects;

public class LoginPage extends CommandsOrangeHRM{

	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void loginWithValidCredentials(String username, String password, String expectedtitle) throws InterruptedException {
		type(OrangeHRMObjects.username, username);
		type(OrangeHRMObjects.password, password);
		click(OrangeHRMObjects.login_button);
		String actualTitle=getTitle();
		validate(actualTitle, expectedtitle);
	}
	
	public void loginWithInValidCredentials(String username, String password, String expectederrormessage) throws InterruptedException {
		type(OrangeHRMObjects.username, username);
		type(OrangeHRMObjects.password, password);
		click(OrangeHRMObjects.login_button);
		String actualerrormessage= getUIValue(OrangeHRMObjects.invalidlogin_error);
		validate(actualerrormessage, expectederrormessage);
	}
	
}
