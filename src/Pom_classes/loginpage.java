package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
//variables/elements present on page
		@FindBy(xpath="//input[@id='username']")private WebElement un;
		@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
		@FindBy(xpath="//div[text()='Login ']")private WebElement logbutn;
		//use constructor
		public loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		public void enterUn() {
			un.sendKeys("admin");
		}
		public void enterPwd() {
			pwd.sendKeys("manager");
		}
		public void clickLogin() {
			logbutn.click();
		}
		
	}


