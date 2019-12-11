package glue;

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
import pageobject.LandingPage;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class GoogleSearch {
    private WebDriverFactory contextSteps;
    private WebDriver driver;
    private AADriver myDriver;


    public GoogleSearch(WebDriverFactory contentSteps) {
        this.driver = contentSteps.getDriver();
        myDriver = new AADriver(driver);
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

//
//    @Given("^user opens \"([^\"]*)\" portal on \"([^\"]*)\" environment$")
//    public void useropensGoogleportal(String Google, String PROD) throws Throwable {
//// Write code here that turns the phrase above into concrete actions
////<CODE>
//    }
//
//    @Then("^user sees \"([^\"]*)\" object on \"([^\"]*)\" page$")
//    public void userseesEditBoxobject(String EditBox, String Home) throws Throwable {
//// Write code here that turns the phrase above into concrete actions
////<CODE>
//    }
//
//    @Then("^user sees \"([^\"]*)\" object on \"([^\"]*)\" page$")
//    public void userseesSearchobject(String Search, String Home) throws Throwable {
//// Write code here that turns the phrase above into concrete actions
////<CODE>
//    }

    //<METHOD>


}
