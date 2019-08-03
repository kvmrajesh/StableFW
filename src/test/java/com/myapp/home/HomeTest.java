package com.myapp.home;

import org.testng.annotations.Test;

import utility.Baseclassutility;

public class HomeTest extends Baseclassutility{

	@Test(priority=3,groups= {"smokeTest"})
	public void navigateTab1() {
		System.out.println("navigateTab1 verification");
	}

	@Test(priority=1)
	public void navigateTab2() {
		System.out.println("navigateTab2 verification");
	}

	@Test(priority=2)
	public void navigateTab3() {
		System.out.println("navigateTab3 verification");
	}
}
