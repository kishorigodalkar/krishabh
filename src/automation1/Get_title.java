package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String expectT ="Google";
	String actT =driver.getTitle();
	System.out.println(actT);
	
if(expectT.equals(actT)) {
		System.out.println("TC is pass`");
	}
	else {
		System.out.println("TC is fail");
	}
}
}