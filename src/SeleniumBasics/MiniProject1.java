package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MiniProject1 {

 WebDriver d;
 @Parameters("browser")
 @BeforeTest
 public void setup(String browser)
 {
	 System.out.println("The browser is - " +browser);
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
		 d=new ChromeDriver();
		 
	 }
	 else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Root Folder(PS)\\Automation\\Drivers\\geckodriver.exe");
			d=new FirefoxDriver();
		}
 }
 @Test(priority=0)
 public void userid() throws InterruptedException
 {
	 d.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
	 WebElement userid=d.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
	 userid.sendKeys("Pavani");
	 Thread.sleep(3000);
 }
 @Test(priority=1)
 public void password() throws InterruptedException
 {
	 WebElement password=d.findElement(By.xpath("//input[@id=\"RESULT_TextField-2\"]"));
	 password.sendKeys("Pavani999");
	 Thread.sleep(3000);
	 }
 @Test(priority=2)
 public void radiobutton() throws InterruptedException
 {
	 WebElement button = d.findElement(By.xpath("//div[@id='q26']/table/tbody/tr/td/label"));
	 button.click();
	 Thread.sleep(3000);
 }
 @Test(priority=3)
 public void dropdown() throws InterruptedException
 {
	 Select dd= new Select(d.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']")));
	 dd.selectByVisibleText("Evening");
	 Thread.sleep(3000);
	 System.out.println("The selected option is -" +dd.getFirstSelectedOption().getText());
	 List<WebElement> options=dd.getOptions();
	 System.out.println("The no of options are - " +options.size());
	 for(WebElement e : options)
	 {
		 System.out.println(e.getText());
	 }
 }
 @Test(priority=4)
 public void checkboxes()
 {
	 List<WebElement> checkboxes=d.findElements(By.xpath("//input[@type='checkbox']"));
	int totalboxes=checkboxes.size();
	 System.out.println("The checkboxes are - " +totalboxes);
	 for(WebElement e : checkboxes)
	 {
		 String value=e.getAttribute("value");
		 System.out.println("Value is - " +value);
	 }
 }
 @AfterTest
 public void teardown()
 {
	 d.quit();
 }
	
	
}
