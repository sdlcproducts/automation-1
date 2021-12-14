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

public static By SearchButton = By.xpath("//button[@class='search-global-typeahead__collapsed-search-button']");

public static By SearchTextboxText = By.xpath("//input[@class='search-global-typeahead__input always-show-placeholder']");

public static By QAEngineerText = By.xpath("(//span[@class='search-global-typeahead__hit-info truncate'])[2]");

public static By SeeAllPeopleButton = By.xpath("//a[.='See all people results']");

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
