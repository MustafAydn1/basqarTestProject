package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class _02_CreateCityAndDelete {
    //WebDriver driver;

    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
  //  leftNavPOM leftNav=new leftNavPOM();

    @Then("^Delete city$")
    public void deleteCity() {
        fromContent.findElementAndClickFunction("inputCityCountrySearch");
        dialogContent.select("SOMECOUNTRY1");
        fromContent.findElementAndSendKeysFunction("inputSearchName","Izmir1");
        fromContent.findElementAndClickFunction("btncityDelete");
        dialogContent.findElementAndClickFunction("btnYes");

    }
}
