package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {
	@Test
	public void testase1()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/akash/Desktop/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("akash");
		
	}

}
