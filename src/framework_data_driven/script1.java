package framework_data_driven;


import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {
public static void main(String[] args) throws Throwable {
	FileInputStream file= new FileInputStream("C:\\Users\\user\\Documents\\actitime.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
//to enter usename
String usern = sh.getRow(0).getCell(0).getStringCellValue();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys(usern);
//enter password and login
String pass = sh.getRow(0).getCell(1).getStringCellValue();
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass,Keys.ENTER);
//to click
//driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.close();
}
}
