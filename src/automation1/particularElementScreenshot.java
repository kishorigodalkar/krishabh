package automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class particularElementScreenshot {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	WebElement store = driver.findElement(By.xpath("//h1[@class='display-1 mt-0 mt-md-5 pb-1']"));
	File src = store.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\user\\Desktop\\screenshot\\selenium.png");
	Files.copy(src, dest);
	driver.close();	
}
}
