package com.myapp.login;

import org.testng.annotations.Test;

import utility.Baseclassutility;

public class LoginTest extends Baseclassutility{
	
	@Test(priority=3,groups = {"smokeTest"})
	public void loginusingUNPW() {
		System.out.println("login using UN PW");
	}

	@Test(priority=1,groups = {"Regression Test"})
	public void loginusingEmailPW() {
		System.out.println("login using Email PW");
	}
	
	
	@Test(priority=2,groups= {"Regression Test"})
	public void loginusingOTP() {
		System.out.println("login using OTP");
	}
	
}
