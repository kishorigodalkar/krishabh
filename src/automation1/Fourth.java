package automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver fire=new ChromeDriver();
	fire.get("https://www.simplilearn.com/");
	fire.manage().window().maximize();

}

}
