package StepDefination;

import Pages.dialogContentPOM; // buna neden gerek oldu???
import Pages.leftNavPOM;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;
    dialogContentPOM dialogContent=new dialogContentPOM();


    @Given("^Navigate to basqar website$")
    public void navigateToBasqarWebsite() {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


    }

    @When("^Login with valid username and password$")
    public void loginWithValidUsernameAndPassword() {


        dialogContent.findElementAndSendKeysFunction("inputUserName","daulet2030@gmail.com");
        dialogContent.findElementAndSendKeysFunction("inputPassword","TechnoStudy123@"  );
        dialogContent.findElementAndClickFunction("clickCheckBox");
        dialogContent.findElementAndClickFunction("btnLogin");
        dialogContent.findElementAndClickFunction("btnGotIt");
    }
}
