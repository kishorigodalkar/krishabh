package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public void verifytext() {
	String exptT="Enter Time-Track";
	String actT= text.getText();
	//System.out.println(actT);
	if(exptT.equals(actT)){
		System.out.println("Tc is pass");
	}
	else {
		System.out.println("Tc is fail");
	}
}
}
