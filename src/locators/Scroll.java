package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.jiosaavn.com/");
	//maximise
	driver.manage().window().maximize();
	//search
	driver.findElement(By.xpath("//input[@class='rbt-input-main form-control rbt-input']")).sendKeys("Kesariya");
	Thread.sleep(4000);
	//song
	driver.findElement(By.xpath("//a[text()='Kesariya']")).click();
	Thread.sleep(3000);
	//play
	driver.findElement(By.xpath("//a[@class='c-btn c-btn--primary']")).click();
}
}
