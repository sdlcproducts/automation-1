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
public static By button60 = By.xpath("(//input[contains(@class,'u-btn u-btn--primary u-btn--block qa-continue-button')])[1]");

public static By textbox70 = By.xpath("(//input[contains(@class,'c-form-group__text-input c-form-group__text-input--pronounced c-form-group__text-input--username username qa-username-input')])[1]");

//<XPATHS>

/*Page Constructor*/
public feature1Page(){

}


public feature1Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

public WebElement clickButton(String objectName) throws Exception {
        //Write Text
        String actualText = null;
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
