package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;
//<IMPORTS>

public class feature5Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By UsernameText = By.xpath("(//input[contains(@class,'input__input')])[1]");

public static By PasswordText = By.xpath("(//input[contains(@class,'input__input')])[2]");

public static By SignInButtonButton = By.xpath("(//button[contains(.,'Sign in')])[1]");

//<XPATHS>

/*Page Constructor*/
public feature5Page(){

}


public feature5Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

//<METHOD>
}
