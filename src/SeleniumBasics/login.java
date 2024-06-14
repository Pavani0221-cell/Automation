package SeleniumBasics;

import static org.testng.Assert.assertEquals;//
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.facebook.com/r.php?locale=en_GB");
      
        assertTrue(d.findElement(By.xpath("//div[contains(text(),'new account')]")).isDisplayed());
       
        d.quit();
        
        

	}

}
