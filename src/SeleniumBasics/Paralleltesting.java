package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltesting {
	WebDriver d;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{
		System.out.println("The browser is - " +browser);
		System.out.println("Thread id - " +Thread.currentThread().getId());
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
			d=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\geckodriver.exe");
			d=new FirefoxDriver();
		}
	}
	@Test
	public void Test() throws InterruptedException
	{
		d.get("https://www.google.com/");
		Thread.sleep(3000);
	}
	@AfterTest
	public void teardown()
	{
		d.quit();
	}
	

}
