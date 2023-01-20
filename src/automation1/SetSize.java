package automation1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	//to create the object of dimension class
	Dimension d = new Dimension(200, 400);
	//to use the set size method
	driver.manage().window().setSize(d);
	driver.close();
}
}