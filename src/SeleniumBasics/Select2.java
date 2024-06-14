package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Root Folder(PS)\\Automation\\Drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://jqueryui.com/selectmenu/");
        d.manage().window().maximize();
        d.switchTo().frame(0);
        d.findElement(By.id("speed-button")).click();
        if (d.findElement(By.xpath("//ul[@id='speed-menu']")).isDisplayed()) {
            WebElement wb1 = d.findElement(By.xpath("//div[text()='Faster']"));
            wb1.click();
            String so1 = wb1.getText();
            System.out.println("Selected option is - " + so1);
            Thread.sleep(3000);
        }

        d.findElement(By.xpath("//span[@id='files-button']")).click();
        if (d.findElement(By.id("files-menu")).isDisplayed()) {
            WebElement wb2 = d.findElement(By.xpath("//div[text()='ui.jQuery.js']"));
            wb2.click();
            String so2 = wb2.getText();
            System.out.println("Selected option is - " + so2);
            Thread.sleep(3000);
        }

        d.findElement(By.xpath("//span[@id='number-button']")).click();
        if (d.findElement(By.id("number-menu")).isDisplayed()) {
            WebElement wb3 = d.findElement(By.xpath("//div[@id='ui-id-16']"));
            wb3.click();
            String so3 = wb3.getText();
            System.out.println("Selected option is - " + so3);
            Thread.sleep(3000);
        }
        d.close();
    }

}