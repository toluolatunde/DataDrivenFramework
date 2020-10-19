package com.operator.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.operator.dataprovider.LoginCredentials;
import com.operator.base.DriverInstance;
import com.operator.pages.LoginPage;


public class ValidateLogin extends DriverInstance {

	@Test (dataProvider = "Agentlogin", dataProviderClass=LoginCredentials.class)
	public void validatelogin(String uname, String pass) throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(uname);
		login.enterPassword(pass);
		login.clickSignin();
		
	}
	
}
