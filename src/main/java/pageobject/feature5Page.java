package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import java.lang.reflect.Field;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
//<IMPORTS>

public class feature5Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By text50 = By.xpath("(//input[contains(@class,'gLFyf gsfi')])[1]");

public static By text61 = By.xpath("(//input[contains(@class,'gLFyf gsfi')])[1]");

public static By text70 = By.xpath("(//input[contains(@class,'gLFyf gsfi')])[1]");

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
