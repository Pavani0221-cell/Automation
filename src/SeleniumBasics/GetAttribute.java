package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.facebook.com/login/");
        
	}

}
