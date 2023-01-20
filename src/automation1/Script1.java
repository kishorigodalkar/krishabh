package automation1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Script1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new  ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("kgodalkar08@gmail.com",Keys.TAB,Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000);");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\user\\Desktop\\screenshot\\demo.jpg");
		Files.copy(src, dest);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement option = driver.findElement(By.xpath("//b[@class='caret']"));
		option.click();
	     WebElement o = driver.findElement(By.xpath("//a[text()='Radio & Checkbox Demo']"));
	     o.click();
	driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();
	 driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
	
	     
		
		
	}
}
