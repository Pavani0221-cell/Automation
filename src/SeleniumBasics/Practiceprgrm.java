package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practiceprgrm {
	WebDriver d;
	@Test
	public void Practiceprgrm() throws InterruptedException 
	{
	
        d.get("https://www.w3schools.com/");
        assertEquals(d.getTitle(),"W3Schools Online Web Tutorials");
        d.findElement(By.linkText("CSS")).click();
        //d.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
        
	}
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
	@AfterMethod
	public void close()
	{
		d.quit();
	}
	}
	
	


