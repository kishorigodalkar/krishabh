package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.meetup.com/login/");
driver.manage().window().maximize();
//enter user name
driver.findElement(By.name("email")).sendKeys("Kishorig08@gmail.com");

//to enter password
driver.findElement(By.name("current-password")).sendKeys("@kishorig1683");
//to login in
driver.findElement(By.name("submitButton")).click();
String exptT = "Login to Meetup | Meetup";
String actuT = driver.getTitle();
System.out.println(actuT);
if (exptT.equals(actuT)) {
	System.out.println("Tc is pass");
	
}
else {
	System.out.println("Tc is fail");
}




}
}
