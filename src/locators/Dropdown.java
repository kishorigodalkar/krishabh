package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	//Create account click
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(4000);
	//Enter first username
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vrushabh");
	//enter lastname
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Halgaonkar");
	//enter mob or email
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vrushabhhalgaonkar16@gmail.com");
	//confirm mail
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("vrushabhhalgaonkar16@gmail.com");
	//enter password
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("@Vrushabh12345");
	//day dropdown select
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	//create object of select class for dropdown
	Select s= new Select(day);
	//use selectclassmethoad for data
	s.selectByValue("16");
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	//create object of select class for dropdown
		Select m= new Select(month);
		m.selectByVisibleText("Nov");
		//birthday year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		//create object of select class for dropdown
				Select y= new Select(year);
				y.selectByValue("1996");
				//select gender
				driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
				//click on submit
			//	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				Thread.sleep(5000);
				String exptT="Facebook � log in or sign up";
				String actuT=driver.getTitle();
				
				System.out.println(actuT);
			
				if (exptT.equals(actuT)) {
					System.out.println("TC is pass");
					
				} 
				else {
					System.out.println("TC is fail");

				}
				driver.close();
		
	
}
}
