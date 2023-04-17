package com.pomlogin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestcase {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
	    driver = new ChromeDriver(opt);
	    
	    LoginPage loginpg = new LoginPage(driver);
	    
	    driver.get("https://example.testproject.io/web/");
		Thread.sleep(3000);
		
		loginpg.enterUsername("Ashwini");
		loginpg.enterPassword("12345");
		loginpg.clickOnLoginButton();
		Thread.sleep(3000);
		
		System.out.println("Execution Successful");
		
		driver.close();
		
		
	}

}


