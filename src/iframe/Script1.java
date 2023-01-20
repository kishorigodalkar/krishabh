package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	driver.manage().window().maximize();
	//to get control on that particular frame we have to inspect n copy the index or id name
	driver.switchTo().frame("packageListFrame");
	//to print the elemenent on that particular frame
	String e = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.browsingcontext']")).getText();
	System.out.println(e);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,2000);");
	//to navigate the control on main webpage.
	driver.switchTo().defaultContent();
	//we have to navigate the control.
	driver.switchTo().frame("classFrame");
	//print the element on particular page.
	String e1 = driver.findElement(By.xpath("//h1[@class='title']")).getText();
	System.out.println(e1);
	jse.executeScript("window.scrollBy(0,2000);");
	driver.close();
	
  }
}