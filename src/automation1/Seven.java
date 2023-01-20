package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seven {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://paytm.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
driver.get("https://www.youtube.com/");
driver.findElement(By.name("k")).sendKeys("kesariyan");
Thread.sleep(1000);
driver.close();

	
}

}
