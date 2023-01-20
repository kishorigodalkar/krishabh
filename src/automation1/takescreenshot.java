package automation1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//we have to do typcasting to take the screenshot.
	TakesScreenshot ts = (TakesScreenshot) driver;
	//we have to store the code into the refrence variable.
    File src = ts.getScreenshotAs(OutputType.FILE);
    //creat file class object to store the screenshot on the destop/destination.
	File dest= new File("C:\\Users\\user\\Desktop\\screenshot\\amazon.jpg");
    //use files class and copy method to convert the screenshot form the src to desk i.e from method to the thefolder on the destop.
	com.google.common.io.Files.copy(src,dest);
	driver.close();
	
	
}
}
