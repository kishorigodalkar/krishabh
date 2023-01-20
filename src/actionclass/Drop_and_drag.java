package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_and_drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		//create action class object.
		Actions a =new Actions(driver);
		a.dragAndDrop(element1, element2).perform();
		//to drag the element out of the box.
		a.dragAndDropBy(element2, 200, 200).perform();
		driver.close();
	}
	
}
