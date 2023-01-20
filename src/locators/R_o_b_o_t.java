package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_o_b_o_t {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	//user name
	Robot r= new Robot();
	//to press key
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//to relese key
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	//to press key
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//to relese key
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	//to press key
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//to relese key
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(4000);
	//to press key
	r.keyPress(KeyEvent.VK_RIGHT);
	//to relese key
	r.keyRelease(KeyEvent.VK_RIGHT);
	//it is used for scroll down but it is lengthy process so we dont use it.
	
	
	
}
}
