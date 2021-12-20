package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

//<IMPORTS>

public class feature6Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By defaultText = By.xpath("(//input[contains(@class,'inputtext _55r1 _6luy')])[1]");

public static By LoginButton = By.xpath("//button");

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
