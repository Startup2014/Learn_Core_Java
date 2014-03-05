package selenium_Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Crome_browser_test {
	
	WebDriver driver;
	
@BeforeMethod	
public void launchFirefoxbrowser() {driver = new FirefoxDriver();}

	@BeforeMethod
	public void launchCromebrowser()
	{	
		System.setProperty("webdriver.chrome.driver", "/Users/swatidhoke/Documents/workspace/chromedriver_mac32.zip.cpgz");
		driver = new ChromeDriver();
	} 

	
	@AfterMethod
	public void Closebrowser()
	{
		driver.close();  
	}

}
