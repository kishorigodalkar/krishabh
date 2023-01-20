package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//to perform mouse action .write the xpath of the first element.
		WebElement element2 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//to perform mouse activity create action class object
		Actions a= new Actions(driver);
		a.moveToElement(element2).perform();
		a.click().perform();
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Sign in']"));
		a.moveToElement(element1).perform();
		a.click().perform();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("kgodalkar08@gmail.com",Keys.ENTER);
		//scroll handle using action class 
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).build().perform();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP).build().perform();
		driver.close();
		//a.moveToElement(element1).contextClick().doubleClick().clickAndHold().clickAndHold(element1).click().perform();
		
		
	}
}
