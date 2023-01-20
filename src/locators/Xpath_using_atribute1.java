package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_atribute1 {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	Dimension d = new Dimension(300,100);
	driver.manage().window().setSize(d);
	//to go forward
	driver.navigate().forward();
	driver.navigate().to("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	//to click on radio button
	driver.findElement(By.xpath("//input[@name='radio']")).click();
	//select countries
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("india");
	//to click on dropdown
	driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
	//chose 1st option
	driver.findElement(By.xpath("//option[text()='Option1']")).click();
	//to click on checkbox
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	//to open window
	driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	//enter name
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kishori godalkar");
	//click on confirm
	 // driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
	  
		//open tab
	   // driver.findElement(By.xpath("//a[@id='opentab']]")).click();
	    String exptT="Practice Page";
	    String actuT=driver.getTitle();
	    System.out.println(actuT);
	   driver.close();
	    if (exptT.equals(actuT)) {
	    	System.out.println("TC is pass");
			
		} else {
			System.out.println("TC is fail");

		}
	    	
		
	
	
	
}
}
