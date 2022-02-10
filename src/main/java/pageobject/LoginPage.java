package pageobject;

import framework.AADriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;



//<IMPORTS>
public class LoginPage {



        public static WebDriver driver;
        AADriver myDriver;
        public static Properties properties;


        /*Xpaths*/
        public static By btnSubmit = By.xpath("(//input[contains(@value, 'Google')])[2]");
        public static By searchBox = By.xpath("//input[@title='Search']");
        public static By defaultText = By.xpath("(//input[contains(@class,'gLFyf gsfi')])[1]");

        public static By Username = By.xpath("//input[@type='text'][@id='userid']");
        public static By Password = By.xpath("//input[@type='password']");
        public static By SignIn = By.xpath("//input[@value='Sign In']");
        public static By First = By.xpath("(//iframe)[1]");
        public static By Last = By.xpath("(//iframe)[last()]");
        public static By Save = By.xpath("//input[@value='Save']");
        public static By Submit = By.xpath("//input[@value='Submit']");
        public static By OK = By.xpath("(//input[@value='OK'])[3]");
        public static By AddValue = By.xpath("//a[@aria-label='Add a New Value']");
        public static By InvoiceNumber = By.xpath("//input[@id='AZ_VENDOR_ES_VW_INVOICE_ID']");
        public static By Add = By.xpath("//input[@value='Add']");
        public static By WeekEnding = By.xpath("//input[@id='AZ_VCHR_HDR_QV_WEEKEND_DT']");
        public static By InvoiceType = By.xpath("//input[@id='AZ_VCHR_HDR_QV_AZ_INV_TYPE']");
        public static By Hours = By.xpath("//a[@id='AZ_VCHR_HDR_QV_AZ_INV_TYPE$prompt']");
        public static By H = By.xpath("(//a[@class='PSSRCHRESULTSEVENROW'])[last()]");
        public static By Consultant = By.xpath("//input[@id='AZ_VCHR_HDR_QV_NAME_ES']");
        public static By Type = By.xpath("//select[@id='AZ_VCHR_LINE_QV_AZ_INV_ITM_ID$0']");
        public static By Description = By.xpath("//input[@id='AZ_VCHR_LINE_QV_DESCR$0']");
        public static By Quantity = By.xpath("//input[@id='AZ_VCHR_LINE_QV_QTY_VCHR$0']");
        public static By Unit = By.xpath("//select[@id='AZ_VCHR_LINE_QV_AZ_UOM$0']");
        public static By UnitPrice = By.xpath("//input[@id='AZ_VCHR_LINE_QV_UNIT_PRICE$0']");
        public static By SaveForLater = By.xpath("//input[@value='Save for Later']");
        public static By Attachments = By.xpath("//input[@value='Attachments']");
        public static By SaveAndSubmit = By.xpath("//input[@value='Save & Submit']");

        //
//        public static By ChooseFile = By.xpath("//a[@type='file']");
//        public static By Upload = By.xpath("//input[@id='Upload']");
//        public static By Save = By.xpath("//input[@value='Save']");


        public static By Monday = By.xpath("((//form//table[@class='PSPAGECONTAINER'])[1]//table[@id='ACE_width']//table[@id='XX_RPTD_ENTRY$scrolli$0']//table[@class='PSLEVEL1GRID']//td)[4]//input");
        public static By Tuesday = By.xpath("//input[@type='text'][@name='XX_QTY_DAY2$0']");
        public static By Wednesday = By.xpath("//input[@type='text'][@name='XX_QTY_DAY3$0']");
        public static By Thursday = By.xpath("//input[@type='text'][@name='XX_QTY_DAY4$0']");
        public static By Friday = By.xpath("//input[@type='text'][@name='XX_QTY_DAY5$0']");
        public static By Saturday = By.xpath("//input[@type='text'][@name='XX_QTY_DAY6$0']");
        public static By Sunday = By.xpath("//input[@type='text'][@name='XX_QTY_DAY7$0']");

//<XPATHS>

        /*Page Constructor*/
        public LoginPage(){

        }


        public LoginPage(WebDriver driver){
            this.driver= driver;
            myDriver = new AADriver(this.driver);
        }

//<METHOD>


}
