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
public static By link60 = By.xpath("(//a[contains(.,'Companies')])[2]");

public static By link70 = By.xpath("(//li[@class='-pointer'])[2]");

public static By link80 = By.xpath("(//div[.='PayPal'])[2]");

public static By link100 = By.xpath("(//li[@class='-pointer'])[2]");

public static By text111 = By.xpath("//input");

public static By link130 = By.xpath("(//a[contains(.,'People')])[2]");

public static By link140 = By.xpath("(//a[contains(.,'Specialists')])[1]");

public static By link150 = By.xpath("(//a[@href='/people/jess-lee/']//div)[1]");

public static By link160 = By.xpath("(//a[@href='/people/jess-lee/']//div)[1]");

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

public void writeText(String text, String objectName) throws Exception {
        //Write Text
        String actualText = null;
        Field field = null;
        By by= null;
        WebElement element=null;
        try {
            field = this.getClass().getField(objectName);
            by = (By) field.get(this);
            element = driver.findElement(by);
            element.clear();
            element.sendKeys(text);
            actualText = driver.findElement(by).getAttribute("value");
            element=null;
        }catch (Exception e){
            throw new Exception(objectName+" not found in "+ this.getClass().getName()+".class\n"  + e);
        }
       //Assert write text
        assertEquals(text, actualText);
    }


//<METHOD>
}
