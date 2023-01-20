package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_atribute {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	//to enter the username
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//to enter the password
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//to click on login button
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//to get title
	String exptT="actiTIME - Login";
	String actuT=driver.getTitle();
	System.out.println(actuT);
	Thread.sleep(4000);
	driver.close();
	if (exptT.equals(actuT)) {
		System.out.println("TC is pass,user nevigate on home page");
		
	} else {
		System.out.println("TC is fail");

	}
	
	
}

}