package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

//<IMPORTS>

public class feature3Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By Google-SearchText = By.xpath("(//input[contains(@class,'gLFyf gsfi')])[1]");

public static By Search-ButtonButton = By.xpath("(//input[contains(@class,'gNO89b')])[1]");

//<XPATHS>

/*Page Constructor*/
public feature3Page(){

}


public feature3Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

//<METHOD>
}
