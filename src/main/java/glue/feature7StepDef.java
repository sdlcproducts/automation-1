package glue;

import com.google.common.collect.Iterables;
import framework.Settings;
import java.util.Set;
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


import pageobject.feature7Page;

//<IMPORTS>

public class feature7StepDef {
private WebDriverFactory contextSteps;
private WebDriver driver;
private AADriver myDriver;
private static Properties properties;
private String portal;
private String environment;



public feature7StepDef(WebDriverFactory contentSteps){
this.driver = contentSteps.getDriver();
myDriver = new AADriver(driver);
this.properties = Settings.getProperties();
}


@After
public void tearDown(Scenario scenario) throws InterruptedException{
if (scenario.isFailed()) {
Set<String> windows = driver.getWindowHandles();
driver.switchTo().window(Iterables.getLast(windows));
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


@User("^navigates to \"([^\"]*)\"$")
public void method1(String param11) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//navigation2
driver.get(param11);
//<CODE>
}

 @When("^user enters \"([^\"]*)\" as \"([^\"]*)\" on \"([^\"]*)\" page$")
public void method2(String param21, String param22, String param23) throws Throwable {
// Write code here that turns the phrase above into concrete actions

//<CODE>
}

 @And("^click the \"([^\"]*)\" button$")
public void method4(String param41) throws Throwable {
// Write code here that turns the phrase above into concrete actions
//button1
feature7Page feature7Page = new feature7Page(driver);
feature7Page.clickButton(param41);
//<CODE>
}

 @Then("^user should navigate to the home page$")
public void method5() throws Throwable {
// Write code here that turns the phrase above into concrete actions
//<CODE>
}

 //<METHOD>


}