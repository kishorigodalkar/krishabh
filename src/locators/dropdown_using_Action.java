package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_using_Action {

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
			Actions a= new Actions(driver);
			a.click(day).perform();
			a.sendKeys(Keys.ARROW_UP).perform();
			a.sendKeys(Keys.ARROW_DOWN).perform();
			driver.close();
	}

}
