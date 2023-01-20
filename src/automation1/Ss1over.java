package automation1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Ss1over {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	String r = RandomString.make();
	WebElement s = driver.findElement(By.xpath("//p[@class='display-1 font-weight-normal mb-0']"));
	File src = s.getScreenshotAs(OutputType.FILE);
	File dest =new File("C:\\Users\\user\\Desktop\\screenshot\\selenium.png");
	Files.copy(src, dest);
	driver.close();
	
}
}