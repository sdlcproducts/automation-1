package glue;

import Docx.Docx;
import com.google.common.collect.Iterables;

import cucumber.api.PendingException;
import framework.Settings;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.*;
import org.openqa.selenium.*;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import framework.AADriver;
import framework.WebDriverFactory;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.previous;
import static org.junit.Assert.assertTrue;


import org.apache.commons.lang.RandomStringUtils;
//<IMPORTS>

public class StepDefinitions {
private WebDriverFactory contextSteps;
private WebDriver driver;
private AADriver myDriver;
private static Properties properties;
private String portal;
private String environment;
 private FileInputStream fis;
 private XWPFDocument file;
 private String filePath;
 private HashMap<String, String> invoiceData;
 private String hours;
 private String previousMonday;
 private String previousFriday;
 private String invoiceDate;


 public StepDefinitions(WebDriverFactory contentSteps){
this.driver = contentSteps.getDriver();
myDriver = new AADriver(driver);
properties = Settings.getProperties();
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

 @When("^user enters \"([^\"]*)\" into \"([^\"]*)\" textbox in \"([^\"]*)\" page$")
public void method17(String param21, String param22, String param23) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
myDriver.typeOnPage(param21, param22, param23);//<CODE>
}


 @When("^user types \"([^\"]*)\" into \"([^\"]*)\" textbox in \"([^\"]*)\" page$")
 public void method3(String param21, String param22, String param23) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text2
  myDriver.typeOnPage(param21, param22, param23);//<CODE>
 }

 @When("^user sees \"([^\"]*)\" element$")
 public void method4(String param21) throws Throwable {
// Write code here that turns the phrase above into concrete actions//null
  driver.get(param21);//null
driver.get(param21);//<CODE>
 }

 @Then("^user types \"([^\"]*)\" into \"([^\"]*)\" textbox$")
 public void method5(String param31, String param32) throws Throwable {
// Write code here that turns the phrase above into concrete actions//text1
  myDriver.typeOnPage(RandomStringUtils.randomAlphanumeric(20), param31, param32);//text1
myDriver.typeOnPage(RandomStringUtils.randomAlphanumeric(20), param31, param32);//<CODE>
 }

 @Then("^user clicks on \"([^\"]*)\" button on \"([^\"]*)\" page$")
 public void method8(String param41, String param42) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
  myDriver.clickOnPage(param41, param42);//<CODE>
 }

 @When("^user clicks \"([^\"]*)\" button on \"([^\"]*)\" page$")
 public void method1(String param21, String param22) throws Throwable {
// Write code here that turns the phrase above into concrete actions//button1
  myDriver.clickOnPage(param21, param22);//button1
myDriver.clickOnPage(param21, param22);//<CODE>
 }


 @Given("^user opens \"([^\"]*)\" invoice template$")
 public void userOpensInvoiceTemplate(String invoicePath) throws Throwable {
  // load DOCX file
  filePath = invoicePath;
  fis = new FileInputStream(filePath);
// open file
  file = new XWPFDocument(OPCPackage.open(fis));
  invoiceData = new HashMap<>();

 }

 @Given("^user updates invoice number to \"([^\"]*)\"$")
 public void userHasInvoiceTemplate(String invoiceNumber) throws Throwable {

  String invoiceNumberTempValue = "<INV-NUM>";

  System.out.println(LocalDate.now().with( previous( SUNDAY ) ).toString());

  invoiceData.put(invoiceNumberTempValue, invoiceNumber);


// display text
  XWPFWordExtractor ext = new XWPFWordExtractor(file);
  System.out.println(ext.getText());
 }


 @And("^user updates invoice date to \"([^\"]*)\"$")
 public void userUpdatesInvoiceDateTo(String date) throws Throwable {
  invoiceDate = date;
//  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
  SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
//  String dateInString = "01-January-2015";
  Date startDate = formatter.parse(date);
//  Date formattedStartDate = formatter.parse(date);


//  String previousSunday= startDate.toInstant().with(previous(SUNDAY)).toString();


//  previousMonday = LocalDate.now().with(previous(MONDAY)).toString();
//  previousFriday = LocalDate.now().with(previous(FRIDAY)).toString();
  previousMonday = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().with(previous(MONDAY)).toString();
  previousFriday = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().with(previous(FRIDAY)).toString();
  String invoiceDateTempValue = "<DATE>";
  String invoiceDescriptionTempValue = "<DESCRIPTION>";
  invoiceData.put(invoiceDateTempValue, date);
  invoiceData.put(invoiceDescriptionTempValue,previousMonday.concat(" to ").concat(previousFriday).concat(" Invoice"));
 }

 @And("^user updates invoice hours to \"([^\"]*)\"$")
 public void userUpdatesInvoiceHoursTo(String hours) throws Throwable {
  String invoiceHoursTempValue = "<HOURS>";
  this.hours = hours;
  invoiceData.put(invoiceHoursTempValue, hours);
 }

 @And("^user updates invoice rate to \"([^\"]*)\"$")
 public void userUpdatesInvoiceRateTo(String rate) throws Throwable {
  String invoiceRateTempValue = "<RATE>";
  String invoiceTotalTempValue = "<TOTAL>";
  int total = Integer.parseInt(hours) * Integer.parseInt(rate);
  invoiceData.put(invoiceRateTempValue, rate);
  invoiceData.put(invoiceTotalTempValue, String.valueOf(total));
 }


 @And("^user saves document$")
 public void userSavesDocument() throws IOException {
  Docx docx = new Docx(file);
  file = docx.replaceDocxWords(invoiceData);
  file.write(new FileOutputStream("C:\\Users\\VADR\\Documents\\Artech Invoicing\\output.docx"));

 }

 @And("^user prints out invoice with \"([^\"]*)\" pdf name$")
 public void userPrintsOutPdf(String pdfName) throws Throwable{

  String outputPath = filePath.replace("Invoice Template.docx", pdfName+".pdf");
  FileInputStream in = new FileInputStream("C:\\Users\\VADR\\Documents\\Artech Invoicing\\output.docx");
// open file
  XWPFDocument document = new XWPFDocument(OPCPackage.open(in));
//  InputStream in = new FileInputStream(new File(filePath.replace("Invoice Template.docx","output.docx")));
//  XWPFDocument document = new XWPFDocument(in);
  PdfOptions options = PdfOptions.create();
  OutputStream out = new FileOutputStream(new File(outputPath));
  PdfConverter.getInstance().convert(document,out,options);

//
 }

 @And("^pause$")
 public void user() throws InterruptedException {
  Thread.sleep(3000);
 }


 @Then("^user switches into \"([^\"]*)\" iframe on \"([^\"]*)\" page$")
 public void userSwitchesIntoIframeOnPage(String iframeName, String pageName) throws Throwable {
  myDriver.switchToIframe(iframeName,pageName);
 }

 @Then("^user switches out of iframe$")
 public void userSwitchesOutOfIframe() {
  driver.switchTo().defaultContent();
 }

 @And("^user waits \"([^\"]*)\" seconds$")
 public void userWaitsSeconds(int seconds) throws Throwable {
  Thread.sleep(seconds*1000);
 }

 @And("^user selects \"([^\"]*)\" value from \"([^\"]*)\" dropdown in \"([^\"]*)\" page$")
 public void userSelectsValueFromDropdownInPage(String selection, String objectName, String pageName) throws Throwable {
  String[] mySelection = selection.split("_");
  String fullName = "";
  for (String s: mySelection
       ) {
   fullName = fullName.concat(" ").concat(s);
  }
  myDriver.selectDropdownOnPage(fullName.trim(),objectName,pageName);
 }

 @And("^user switches to iframe with \"([^\"]*)\" id$")
 public void userSwitchesToIframeWithName(String iFrameName) throws Throwable {
  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='"+iFrameName+"']")));
 }

 @And("^user uploads invoice from \"([^\"]*)\" location$")
 public void userUploadsInvoiceFromLocation(String location) throws Throwable {
  WebElement chooseFile = driver.findElement(By.xpath("//input[@name='#ICOrigFileName']"));
  chooseFile.sendKeys(location);
 }
 @Then("^user waits for \"([^\"]*)\" seconds$")
public void method7(String param131) throws Throwable {
// Write code here that turns the phrase above into concrete actions//waits1
Thread.sleep(param131*1000);//waits1
Thread.sleep(param131*1000*1000);//waits1
Thread.sleep(param131*1000*1000*1000);//waits1
Thread.sleep(param131*1000*1000*1000*1000);//waits1
Thread.sleep(param131*1000*1000*1000*1000*1000);//waits1
Thread.sleep(param131*1000*1000*1000*1000*1000*1000);//waits1
Thread.sleep(param131*1000*1000*1000*1000*1000*1000*1000);//waits1
Thread.sleep(param131*1000*1000*1000*1000*1000*1000*1000*1000);//<CODE>
}

 //<METHOD>


}