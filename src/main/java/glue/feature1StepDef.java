package glue;

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

import static org.junit.Assert.assertTrue;
import java.util.Properties;

import org.junit.*;

import pageobject.feature1Page;

import org.apache.commons.lang.RandomStringUtils;
import pageobject.feature1Page;

//<IMPORTS>

public class feature1StepDef {
private WebDriverFactory contextSteps;
private WebDriver driver;
private AADriver myDriver;
private static Properties properties;
private String portal;
private String environment;



public feature1StepDef(WebDriverFactory contentSteps){
this.driver = contentSteps.getDriver();
myDriver = new AADriver(driver);
this.properties = Settings.getProperties();
}


@After
public void tearDown(Scenario scenario) throws InterruptedException{
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
//Slow down the script
Thread.sleep(10000);

}


@Given("^user navigates to \"([^\"]*)\"$")
public void method1(String param11) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//navigation2
driver.get(param11);
//<CODE>
}

 @When("^user clicks \"([^\"]*)\" button$")
public void method2(String param21) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//button1
feature1Page feature1Page = new feature1Page(driver);
feature1Page.clickButton(param21);
//<CODE>
}

 @Then("^user sees \"([^\"]*)\" element$")
public void method3(String param31) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//exists1
feature1Page feature1Page = new feature1Page(driver);
feature1Page.elementExists(param31);
//<CODE>
}

 @Then("^user clicks \"([^\"]*)\" link$")
public void method4(String param41) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//link1
feature1Page feature1Page = new feature1Page(driver);
feature1Page.clickLink(param41);
//<CODE>
}

 @Then("^user types in \"([^\"]*)\" in \"([^\"]*)\" textbox$")
public void method6(String param61, String param62) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//text2
feature1Page feature1Page = new feature1Page(driver);
feature1Page.writeText(param61, param62);
//<CODE>
}

 //<METHOD>


}