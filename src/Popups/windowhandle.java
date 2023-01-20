package Popups;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("one plus mobile",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"col col-7-12\"]")).click();
		//to shift the control on child window from first(main)window,use window method
		Set<String> win = driver.getWindowHandles();
		//store the window create the object of arraylist.
		ArrayList<String> al = new ArrayList<String>(win);
		//print main windowsessin idet
		String firstwin = al.get(0);
		System.out.println(firstwin);
		//print the child window sessio id
		String childwin = al.get(1);
		System.out.println(childwin);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		driver.switchTo().window(childwin);
			//click on add to cart
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.close();

			
		
	}

}
