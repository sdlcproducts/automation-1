package pageobject;

import java.lang.reflect.Field;
import java.util.Properties;

import framework.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.AADriver;
import org.openqa.selenium.WebElement;
import org.springframework.test.context.ContextConfiguration;

//<IMPORTS>
//@ContextConfiguration
public class HiPage {

    public static WebDriver driver;
    AADriver myDriver;
    public static Properties properties;


    /*Xpaths*/
    public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
    public static By searchBox = By.xpath("//input[@title='Search']");
    public static By TEXTBOX21 = By.xpath("//input[contains(@class,'c-form-group__text-input c-form-group__text-input--pronounced c-form-group__text-input--username username qa-username-input')][1]");

    public static By TEXTBOX32 = By.xpath("//input[contains(@class,'c-form-group__text-input c-form-group__text-input--pronounced c-form-group__text-input--username username qa-username-input')][1]");

//<XPATHS>

    /*Page Constructor*/
    public HiPage() {

    }


    public HiPage(WebDriver driver) {
        this.driver = driver;
        myDriver = new AADriver(this.driver);
    }


    //id=1
    public boolean verifyPageIsLoaded() {
        return myDriver.verifyObjectPresent(TEXTBOX21);

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
        Assert.assertEquals(text, actualText);
    }


//<METHOD>
}
