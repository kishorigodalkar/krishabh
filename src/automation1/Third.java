package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver auto = new ChromeDriver();
	auto.get("https://www.instagram.com/");
	auto.manage().window().maximize();
	Thread.sleep(1000);
	auto.findElement(By.xpath("//input[@id'twoabsearchtextbox']"));
}

}
