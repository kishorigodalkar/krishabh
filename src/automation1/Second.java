package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver k =new ChromeDriver();
	k.get("https://www.google.com//");
	k.manage().window().maximize();
	Thread.sleep(2000);
	k.get("https://www.amazon.in/");
}

}
