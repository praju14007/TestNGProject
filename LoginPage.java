package com.pomlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//POM Without PageFactory
	
		WebDriver driver;
		
		// Constructor
		LoginPage(WebDriver d)
		{	
			driver = d;	
		}
		
		By username = By.id("name");
		By password = By.id("password");
		By login = By.id("login");
		
		public void enterUsername(String uname) {
			
			driver.findElement(username).sendKeys(uname);
		}
		
		public void enterPassword(String pwd) {
			
			driver.findElement(password).sendKeys(pwd);
		}
		
		public void clickOnLoginButton() {
			
			driver.findElement(login).click();
		}
		

}
