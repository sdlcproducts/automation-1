package glue;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import framework.AADriver;
import framework.WebDriverFactory;
import pageobject.LandingPage;

import static org.junit.Assert.assertTrue;

import org.junit.*;

public class UiStepDef {
	private WebDriverFactory contextSteps;
	private WebDriver driver;
	private AADriver myDriver;
	
	
	public UiStepDef(WebDriverFactory contentSteps){
		this.driver = contentSteps.getDriver();
		myDriver = new AADriver(driver);
	}
	
	
	@After
	public void tearDown(Scenario scenario){
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
	
//	@Given("^I navigate to \"([^\"]*)\"$")
//	public void iNavigateTo(String url) throws Throwable{
//		LandingPage lp = new LandingPage(driver);
//		assertTrue(lp.verifyPageIsLoaded());
//		//assertTrue(false);
//	}
	
	@Given("^I navigate to \"(.*?)\"$")
	public void i_navigate_to(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(url);
		LandingPage lp = new LandingPage(driver);
		assertTrue(lp.verifyPageIsLoaded());
		//assertTrue(false);
	}
	
	
	
}
