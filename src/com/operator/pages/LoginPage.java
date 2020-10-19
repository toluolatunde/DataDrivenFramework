package com.operator.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.operator.utility.Utility;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterUsername(String uname) throws IOException {
		
		driver.findElement(By.id(Utility.fetchLocator("loginusername_ID"))).sendKeys(uname);
		
	}
	
	public void enterPassword(String pass) throws IOException {
		
		driver.findElement(By.id(Utility.fetchLocator("loginpassword_ID"))).sendKeys(pass);
		
	}
	
	public void clickSignin() throws IOException {
		
		driver.findElement(By.xpath(Utility.fetchLocator("loginbutton_XPATH"))).click();
			
		
	}
	
	
	
}
