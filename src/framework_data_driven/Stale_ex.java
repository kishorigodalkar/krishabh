package framework_data_driven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_ex {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//to enter username
	WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
	driver.navigate().refresh();
	un.sendKeys("admin");
	//enter password and login
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//to click
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.close();
}
}
