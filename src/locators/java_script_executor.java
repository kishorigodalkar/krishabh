package locators;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_script_executor {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//scroll down
	JavascriptExecutor j =(JavascriptExecutor)driver;
	//scroll down
	j.executeScript("window.scrollBy(0,2000);");
	//scroll up
	Thread.sleep(4000);
	j.executeScript("window.scrollBy(0,-1000);");
}
}
