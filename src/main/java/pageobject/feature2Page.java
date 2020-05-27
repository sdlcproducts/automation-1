package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import java.lang.reflect.Field;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

//<IMPORTS>

public class feature2Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By link60 = By.xpath("(//a[contains(.,'People')])[2]");

public static By link70 = By.xpath("(//a[contains(.,'Specialists')])[1]");

public static By link80 = By.xpath("//div[.='Jess Lee']/..//button/span");

//<XPATHS>

/*Page Constructor*/
public feature2Page(){

}


public feature2Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

public WebElement clickLink(String objectName) throws Exception {
        //Click Link
       Field field = null;
        By by= null;
        WebElement element=null;
        try {
            field = this.getClass().getField(objectName);
            by = (By) field.get(this);
            element = driver.findElement(by);
            element.click();
        }catch (Exception e){
            throw new Exception(objectName+" not found in "+ this.getClass().getName()+".class\n"  + e);
        }
        return element;
    }

//<METHOD>
}
