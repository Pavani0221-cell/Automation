package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screenshotdemo {
	WebDriver d;
	@Test
	public void testScreenshot() throws IOException, InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
		d.get("https://www.facebook.com/");
		//assertEquals(d.getTitle(), "Facebook - log in or sign up");
		d.findElement(By.linkText("Forgotten password?")).click();
		DateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date dt = new Date();
		File screenshotFile= ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:\\\\Root Folder(PS)\\\\ABC Banking\\\\bin\\\\screenshot\\\\"+sdf.format(dt)+".png"));
		
		Thread.sleep(3000);
		}
	@BeforeMethod
	public void setUp()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@AfterMethod
	public void tearDown()
	{
		d.quit();
	}
	
	

}
