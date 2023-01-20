package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mock {
	
   //static WebDriver driver;
 
 
	
	public static void main(String[] args) throws InterruptedException {
		
		Mock sc = new Mock();
		sc.main();
	launch_browser("chrome");
	}

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase(System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe"))) {
			 WebDriver driver = new ChromeDriver();
			 
		} else if (browser.equalsIgnoreCase(System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\user\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe"))) {
			  WebDriver driver = new FirefoxDriver();
		}

	}

	public void main() throws InterruptedException  {
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
	
		//WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(3000);
//		driver.manage().window().getSize();
//    		Thread.sleep(2000);
//    		driver.navigate().to("https://www.flipkart.com/");
//    		Thread.sleep(4000);
//    		driver.manage().window().maximize();
//    		driver.navigate().back();
//    		driver.navigate().forward();
//    		driver.navigate().refresh();
//    		driver.findElement(By.xpath("//input[@name='q']")).click();
//    		
//    		driver.findElement(By.xpath("//input[@type='text'] ")).sendKeys("one plus mobile");

	}

}
