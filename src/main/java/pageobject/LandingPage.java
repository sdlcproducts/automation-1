package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

public class LandingPage {

	public static WebDriver driver;
	AADriver myDriver;
	public static Properties properties;
	
	
	/*Xpaths*/
	public static By btSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
	
	public LandingPage(){
		
	}
	
	public LandingPage(WebDriver driver){
		this.driver= driver;
		myDriver = new AADriver(this.driver);
	}
	
	public boolean verifyPageIsLoaded(){
		return myDriver.verifyObjectPresent(btSubmit);
	
	}
}
