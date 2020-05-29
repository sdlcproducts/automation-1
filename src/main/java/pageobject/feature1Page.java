package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import java.lang.reflect.Field;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

//<IMPORTS>

public class feature1Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By link60 = By.xpath("//a[.='Portfolio']");

public static By link70 = By.xpath("//li[@id='Bitmain']/a");

public static By link80 = By.xpath("//li[@id='Bitmain']/a");

public static By link100 = By.xpath("//a[.='News']");

public static By text110 = By.xpath("//h3[contains(.,'The Midas List')]");

public static By link120 = By.xpath("//h3[contains(.,'The Midas List')]/../..//a");

public static By link130 = By.xpath("//h3[contains(.,'The Midas List')]/../..//a");

//<XPATHS>

/*Page Constructor*/
public feature1Page(){

}


public feature1Page(WebDriver driver){
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

 public boolean elementExists(String objectName) throws Exception {
    //Element exists
    Field field = null;
    By by= null;
    boolean status;
    try {
      field = this.getClass().getField(objectName);
      by = (By) field.get(this);
      status = myDriver.verifyObjectPresent(by);
    }catch (Exception e){
      throw new Exception(objectName+" not found in "+ this.getClass().getName()+".class\n"  + e);
    }
    return status;
  }

//<METHOD>
}
