package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com//");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.navigate().to("https://www.simplilearn.com/");
	driver.manage().window().maximize();
	//to go backward
	driver.navigate().back();
	Thread.sleep(2000);
	//to go forward
	driver.navigate().forward();
	//to refresh(which change the object of web page)
	driver.navigate().refresh();
}

}
