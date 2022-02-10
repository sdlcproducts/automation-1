package pageobject;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.*;

import framework.AADriver;

import java.lang.reflect.Field;
//<IMPORTS>

public class feature5Page {

public static WebDriver driver;
AADriver myDriver;
public static Properties properties;
JavascriptExecutor js;

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
   js = (JavascriptExecutor) driver;
}

//<METHOD>

    public void getCompanyName(String jobTitle) throws InterruptedException {
        List<WebElement> candidate = driver.findElements(By.xpath("//div[@class='entity-result__primary-subtitle t-14 t-black t-normal']"));
        int index = driver.findElements(By.xpath("//div[@class='entity-result__primary-subtitle t-14 t-black t-normal']")).size();
        for (int i = 0; i < index; i++) {

                Thread.sleep(3000);

            candidate.get(i).click();
            Thread.sleep(3000);
            WebElement company = driver.findElement(By.xpath("//div[@class='pv-entity__logo company-logo']"));
            company.click();
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//            js.executeScript("window.scrollBy(0,250)", "");

            WebElement people = driver.findElement(By.xpath("//a[contains(.,'People')]"));
            js.executeScript("arguments[0].scrollIntoView(true);", people);
            people.click();
            WebElement textbox = driver.findElement(By.xpath("//input[@id='people-search-keywords']"));
            textbox.sendKeys(jobTitle);
            textbox.sendKeys(Keys.RETURN);

            WebElement companyName = driver.findElement(By.xpath("//span[@dir='ltr']"));

            WebElement name1 = driver.findElement(By.xpath("(//div[@class='org-people-profile-card__profile-title t-black lt-line-clamp lt-line-clamp--single-line ember-view'])[1]"));
            WebElement name2 = driver.findElement(By.xpath("(//div[@class='org-people-profile-card__profile-title t-black lt-line-clamp lt-line-clamp--single-line ember-view'])[2]"));

            WebElement title1 = driver.findElement(By.xpath("(//div[@class='lt-line-clamp lt-line-clamp--multi-line ember-view'])[1]"));
            WebElement title2 = driver.findElement(By.xpath("(//div[@class='lt-line-clamp lt-line-clamp--multi-line ember-view'])[2]"));



//        SAVE TO EXCEL

            String cName = companyName.getText();

            String employeeName1 = name1.getText();
            String employeeName2 = name2.getText();


            String employeeTitle1 = title1.getText();
            String employeeTitle2 = title2.getText();


            System.out.println(cName);
            System.out.println(employeeName1);
            System.out.println(employeeTitle1);
            System.out.println(employeeName2);
            System.out.println(employeeTitle2);

            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
        }



    }

}
