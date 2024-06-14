package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.facebook.com/login/");
        System.out.println(d.getTitle());
        d.manage().window().maximize();
        d.findElement(By.id("email")).sendKeys("Pavani");
        d.findElement(By.id("pass")).sendKeys("pavani999");
        d.findElement(By.id("loginbutton")).click();
       
        Thread.sleep(3000);
        d.quit();
        
	}

}
