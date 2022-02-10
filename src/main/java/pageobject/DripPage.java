package pageobject;

import framework.AADriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


//<IMPORTS>
public class DripPage {



        public static WebDriver driver;
        AADriver myDriver;
        public static Properties properties;


        /*Xpaths*/

        public static By ConnectWallet = By.xpath("(//button)[9]");



//<XPATHS>

        /*Page Constructor*/
        public DripPage(){

        }


        public DripPage(WebDriver driver){
            this.driver= driver;
            myDriver = new AADriver(this.driver);
        }

//<METHOD>


}
