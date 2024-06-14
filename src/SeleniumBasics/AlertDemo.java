package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		d.findElement(By.name("submit")).click();
		Alert al=d.switchTo().alert();
		assertEquals(al.getText(),"Do you really want to delete this Customer?");
		al.accept();
		Thread.sleep(5000);
		assertEquals(al.getText(),"Customer Successfully Delete!");
		al.accept();
		Thread.sleep(5000);
		d.close();

	}

}
