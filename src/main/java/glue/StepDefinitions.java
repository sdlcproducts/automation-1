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
import framework.AADriver;
import framework.WebDriverFactory;

import static org.junit.Assert.assertTrue;
import java.util.Properties;


import org.apache.commons.lang.RandomStringUtils;
import pageobject.feature1Page;
import pageobject.feature2Page;
//<IMPORTS>

public class StepDefinitions {
private WebDriverFactory contextSteps;
private WebDriver driver;
private AADriver myDriver;
private static Properties properties;
private String portal;
private String environment;



public StepDefinitions(WebDriverFactory contentSteps){
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


@Given("^user navigates to \"([^\"]*)\"$")
public void method1(String param11) throws Throwable {
// Write code here that turns the phrase above into concrete actions//navigation2
driver.get(param11);//<CODE>
}



 @When("^user sees \"([^\"]*)\" element on \"([^\"]*)\" page$")
public void method2(String param21, String param22) throws Throwable {
// Write code here that turns the phrase above into concrete actions//exists1
myDriver.verifyObjectPresentOnPage(param21, param22);//<CODE>
}

 @When("^user types \"([^\"]*)\" into \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method3(String param31, String param32, String param33) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param31, param32, param33);//<CODE>
}

 @When("^user clicks on \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method4(String param41, String param42) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param41, param42);//<CODE>
}


 @When("^user enters \"([^\"]*)\" in \"([^\"]*)\" textbox in \"([^\"]*)\" page$")
public void method6(String param51, String param52, String param53) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param51, param52, param53);//<CODE>
}

 @When("^user enters \"([^\"]*)\" in \"([^\"]*)\" textbox$")
public void method7(String param51, String param52) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text1
myDriver.typeOnPage(RandomStringUtils.randomAlphanumeric(20), param51, param52);//<CODE>
}



 @When("^user enters \"([^\"]*)\" in \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method7(String param21, String param22, String param23) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param21, param22, param23);//<CODE>
}

 @Then("^user clicks \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method8(String param41, String param42) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param41, param42);//<CODE>
}


 @And("^user enters \"([^\"]*)\" in \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method9(String param31, String param32, String param33) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param31, param32, param33);//<CODE>
}

 @And("^user clicks on \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method10(String param51, String param52) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param51, param52);//<CODE>
}

 @And("^user enters \"([^\"]*)\" on \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method11(String param61, String param62, String param63) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param61, param62, param63);//<CODE>
}

 @And("^user clicks \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method12(String param71, String param72) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param71, param72);//<CODE>
}

 @Then("^user enters \"([^\"]*)\" in \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method13(String param31, String param32, String param33) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param31, param32, param33);//<CODE>
}

 @Then("^user clicks on \"([^\"]*)\" button on \"([^\"]*)\" page$")
public void method14(String param51, String param52) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
myDriver.clickOnPage(param51, param52);//<CODE>
}

 @Then("^user enters \"([^\"]*)\" on \"([^\"]*)\" textbox on \"([^\"]*)\" page$")
public void method15(String param61, String param62, String param63) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param61, param62, param63);//<CODE>
}

 @When("^user enter \"([^\"]*)\" in \"([^\"]*)\" textbox$")
public void method16(String param21, String param22) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text1
myDriver.typeOnPage(RandomStringUtils.randomAlphanumeric(20), param21, param22);//<CODE>
}

 @When("^user enters \"([^\"]*)\" into \"([^\"]*)\" textbox in \"([^\"]*)\" page$")
public void method17(String param21, String param22, String param23) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param21, param22, param23);//<CODE>
}

 //<METHOD>


}