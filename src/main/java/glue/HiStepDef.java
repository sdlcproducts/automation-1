package glue;

import cucumber.api.java.eo.Se;
import framework.Settings;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.But;
import cucumber.api.java.en.And;
import framework.AADriver;
import framework.WebDriverFactory;
import org.springframework.test.context.ContextConfiguration;
import pageobject.HiPage;
import pageobject.LandingPage;

import static org.junit.Assert.assertTrue;

import org.junit.*;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Properties;

//<IMPORTS>
//@ContextConfiguration
public class HiStepDef extends WebDriverFactory{
    private WebDriverFactory contextSteps;
    private WebDriver driver;
    private AADriver myDriver;
    private Properties properties;
    private String portal;
    private String environment;


    public HiStepDef(WebDriverFactory contentSteps) {
        this.driver = contentSteps.getDriver();
        myDriver = new AADriver(driver);
        this.properties = Settings.getProperties();

    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.write("Scenario Failed!");
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
// TODO: handle exception
                e.printStackTrace();

            }
        }
    }


//    @Given("^user opens \"([^\"]*)\" portal on \"([^\"]*)\" environment$")
//    public void method11(String param11, String param12) throws Throwable {
//// Write code here that turns the phrase above into concrete actions
//		this.portal = param11.toUpperCase();
//        this.environment = param12.toUpperCase();
//        String url = properties.getProperty(environment + "_" + portal + "_URL");
//        driver.get(url);
////<CODE>
//    }
//
//    @Then("^user types into \"([^\"]*)\" textbox$")
//    public void method22(String param21) throws Throwable {
//// Write code here that turns the phrase above into concrete actions
//        HiPage hi = new HiPage(driver);
//        hi.writeText(RandomStringUtils.randomAlphanumeric(10), "TEXTBOX21");
////        myDriver.typeOnPage(RandomStringUtils.randomAlphanumeric(10), "btSubmit", "LandingPage");
////<CODE>
//    }
//
//    @Then("^user enter \"([^\"]*)\" into \"([^\"]*)\" textbox$")
//    public void method33(String param31, String param32) throws Throwable {
//// Write code here that turns the phrase above into concrete actions
//        HiPage hi = new HiPage(driver);
//        hi.writeText(param31, "TEXTBOX32");
////<CODE>
//    }

    //<METHOD>


}