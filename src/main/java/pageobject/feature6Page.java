package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;
//<IMPORTS>

public class feature6Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By defaultText = By.xpath("(//input[contains(@id,'userid')])[1]");

public static By defaultText = By.xpath("(//input[contains(@id,'pwd')])[1]");

public static By defaultButton = By.xpath("(//input[contains(@class,'ps-button')])[1]");

//<XPATHS>

/*Page Constructor*/
public feature6Page(){

}


public feature6Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

//<METHOD>
}
