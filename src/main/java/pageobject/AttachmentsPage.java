package pageobject;

import framework.AADriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


//<IMPORTS>
public class AttachmentsPage {



        public static WebDriver driver;
        AADriver myDriver;
        public static Properties properties;


        /*Xpaths*/

        public static By AddAttachment = By.xpath("//a[@id='AZ_DER_INV_WRK_ATTACHADD$0']");
        public static By ChooseFile = By.xpath("//a[@type='file']");
        public static By Upload = By.xpath("//input[@id='Upload']");
        public static By Save = By.xpath("//input[@value='Save']");
        public static By Return = By.xpath("//a[.='Return To Invoice Self Service Page']");
        public static By Add = By.xpath("//input[@value='Add']");



//<XPATHS>

        /*Page Constructor*/
        public AttachmentsPage(){

        }


        public AttachmentsPage(WebDriver driver){
            this.driver= driver;
            myDriver = new AADriver(this.driver);
        }

//<METHOD>


}
