package helper;

import com.cucumber.listener.Reporter;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import framework.AADriver;
import framework.WebDriverFactory;

@CucumberOptions(
    features = {"src/test/features"},
    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
    tags = {"@Smoke"},
    glue = {"glue"}
)

@RunWith(Cucumber.class)
public class RunTest {

  private static WebDriverFactory driverFactory;

  @BeforeClass
  public static void setup() {

    driverFactory = new WebDriverFactory();
  }

  @AfterClass
  public static void close() {

    try {
      Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
      AADriver driver = new AADriver(driverFactory.getDriver());
    } catch (Exception e) {
      e.printStackTrace();
      // TODO: handle exception
    }
  }
}
