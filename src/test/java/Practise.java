import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		System.out.println(driver.switchTo().frame("insticatorUserTrackingIframe").getTitle());
		
	}
	

}
