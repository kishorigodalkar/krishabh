package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	drive.get("https://www.flipkart.com/");
	drive.manage().window().maximize();
	Thread.sleep(1000);
	drive.get("https://www.selenium.dev/");}
}
