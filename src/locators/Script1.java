package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new  ChromeDriver();
	driver.get("https://www.meetup.com/register/");
	//click on gmail
	driver.findElement(By.id("email-register")).click();
	//enter user name
	driver.findElement(By.name("name")).sendKeys("kishori godalakr");
	//enter email id
	driver.findElement(By.id("email")).sendKeys("kishorig08@gmail.com");
	//enter new password
	driver.findElement(By.id("new-password")).sendKeys("kishorig1683");
	//location
	driver.findElement(By.xpath("//input[@id='location-bar-in-register']")).sendKeys("Pimpri, IN");
	//click on location
   //    driver.findElement(By.className("p-4")).click();
	//AGe
	driver.findElement(By.className("fill-current hidden")).click();
	//sign up
	// driver.findElement(By.name("submitRegistrationButton")).click();
	String exptT="Create a Meetup Account | Meetup";
	String actuT=driver.getTitle();
	System.out.println(actuT);
	Thread.sleep(4000);
	if (exptT.equals(actuT)) {
		System.out.println("Tc is pass");
		
	} else {
		System.out.println("TC is fail");

	}
	
}
}
