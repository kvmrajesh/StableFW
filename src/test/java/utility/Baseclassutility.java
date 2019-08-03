package utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclassutility {
	@BeforeClass(groups = {"smokeTest","RegressionTest"})
	public void Beforeclasscode() {
		System.out.println("Beforeclasscode here");
	}
	
	@BeforeMethod(groups = {"smokeTest","RegressionTest"})
	public void Beforemethodcode() {
		System.out.println("Beforemethodcode here");
	}
	
	
	@AfterMethod(groups = {"smokeTest","RegressionTest"})
	public void Aftermethodcode() {
		System.out.println("Aftermethodcode here");
	}
	
	@AfterClass(groups = {"smokeTest","RegressionTest"})
	public void Afterclasscode() {
		System.out.println("Afterclasscode here");
	}
}
