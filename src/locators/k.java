package locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class k {
	WebDriver d=new FirefoxDriver();
	
	public static void main(String[] args) {
		kishori("firefox");
		k s = new k();
		s.game();
		s.game();
		}

	public static void kishori(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			WebDriver d = new FirefoxDriver();
		}
	}

	public void name() {

		d.get("https://www.meetup.com");
		 d.manage().window().getSize();
		 d.close();

	}
	public void game() {
		d.get("https://demo.actitime.com/login.do");
	d.close();
	}
	}

