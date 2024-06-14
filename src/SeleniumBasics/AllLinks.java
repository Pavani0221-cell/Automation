package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
        d.get("https://www.guru99.com/");
        d.manage().window().maximize();
        List <WebElement> ls=d.findElements(By.xpath("//ul[@id='java_technologies']"));
       for(WebElement s : ls)
       {
    	   s.click();
    	   Thread.sleep(3000);
    	  // String s1=s.getText();
    	 //System.out.println(s1);  
       }
     
       d.close();
      }

}
