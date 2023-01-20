package automation1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://www.selenium.dev/");
driver.manage().window().maximize();
Thread.sleep(3000);
Point p =new Point(50, 50);
driver.manage().window().setPosition(p);
driver.close();

}

}
