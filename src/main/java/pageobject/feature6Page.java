package pageobject;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;

import java.lang.reflect.Field;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

//<IMPORTS>

public class feature6Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;


/*Xpaths*/
public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
public static By searchBox = By.xpath("//input[@title='Search']");
public static By text61 = By.xpath("(//input[contains(@class,'inputtext _55r1 _6luy')])[1]");

public static By text63 = By.xpath("(//input[contains(@class,'inputtext _55r1 _6luy _9npi')])[1]");

public static By button70 = By.xpath("//button");

//<XPATHS>

/*Page Constructor*/
public feature6Page(){

}


public feature6Page(WebDriver driver){
this.driver= driver;
myDriver = new AADriver(this.driver);
}

public WebElement clickButton(String objectName) throws Exception {
        //Write Text
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
