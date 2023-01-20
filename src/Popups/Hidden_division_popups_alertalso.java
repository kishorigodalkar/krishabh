package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hidden_division_popups_alertalso {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions c =new ChromeOptions();
	c.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(c);
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
      Alert alt = driver.switchTo().alert();
      alt.accept();
    driver.close();



}
	
}
