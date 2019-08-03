package com.myapp.logout;

import org.testng.annotations.Test;

import utility.Baseclassutility;

public class LogoutTest extends Baseclassutility {
	@Test(priority=2,groups= {"smokeTest"})
	public void logout1() {
		System.out.println("logout using X button in the corner");
	}

	@Test(priority=1)
	public void logout2() {
		System.out.println("logout using Menu option");
	}
}
