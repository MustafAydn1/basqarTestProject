package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class _03_createCountryAndCities {
    WebDriver driver;
    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
    leftNavPOM leftNav=new leftNavPOM();

    JavascriptExecutor js=(JavascriptExecutor) driver;
   // WebDriverWait wait=new WebDriverWait(driver,5);

    @When("^Go to countries Page$")
    public void goToCountriesPage(DataTable elements) {
        List<String> clickElements=elements.asList(String.class);
        for (int i = 0; i <clickElements.size() ; i++) {

            leftNav.findElementAndClickFunction(clickElements.get(i));

        }

        fromContent.findElementAndClickFunction("btnAdd");

    }

    @And("^Create a Country$")
    public void createACountry(DataTable elements) {
      List<List<String>> inputElements=elements.asLists(String.class);
        for (int i = 0; i <inputElements.size(); i++) {
            dialogContent.findElementAndSendKeysFunction(inputElements.get(i).get(0),inputElements.get(i).get(1));
        }

    }

    @And("^Save click$")
    public void saveClick(DataTable elements) {
        List<String> clickElements=elements.asList(String.class);
        for (int i = 0; i <clickElements.size() ; i++) {

            dialogContent.findElementAndClickFunction(clickElements.get(i));

        }
    }



    @When("^Go to cities and create a city$")
    public void goToCitiesAndCreateACity() {
        leftNav.findElementAndClickFunction("btnCities");
        fromContent.findElementAndClickFunction("btnAdd");

        dialogContent.waitUntilNeed("nameOfCountries");
        dialogContent.findElementAndClickFunction("nameOfCountries");
        dialogContent.select("SOMECOUNTRY1");
        dialogContent.findElementAndSendKeysFunction("inputName","Izmir1");
        dialogContent.findElementAndClickFunction("btnSave");






    }

    @And("^At first Delete country$")
    public void AtfirstDeletecountry() {
       // driver.navigate().back();

        leftNav.findElementAndClickFunction("btnCountries");
        fromContent.findElementAndSendKeysFunction("inputSearchName","SOMECOUNTRY1");
        fromContent.findElementAndSendKeysFunction("inputSearchCode","SC");
        fromContent.findElementAndClickFunction("btnSearch");
        fromContent.findElementAndClickFunction("afterSearchDelete");
        dialogContent.findElementAndClickFunction("btnYes");




    }


    @Then("^Check control successfully$")
    public void checkControlSuccessfully() {
       fromContent.checkControl("succesAlert","success");
    }

    @Then("^Delete first city after country$")
    public void deleteFirstCityAfterCountry() {

        leftNav.findElementAndClickFunction("btnCities");
        fromContent.findElementAndClickFunction("inputCityCountrySearch");
        dialogContent.select("SOMECOUNTRY1");
        fromContent.findElementAndSendKeysFunction("inputSearchName","Izmir1");
        fromContent.findElementAndClickFunction("btncityDelete");
        dialogContent.findElementAndClickFunction("btnYes");





        leftNav.findElementAndClickFunction("btnCountries");
        fromContent.findElementAndSendKeysFunction("inputSearchName","SOMECOUNTRY1");
        fromContent.findElementAndSendKeysFunction("inputSearchCode","SC");
        fromContent.findElementAndClickFunction("btnSearch");



        fromContent.waitUntilNeed("afterSearchDelete");
        fromContent.findElementAndClickFunction("afterSearchDelete");
        dialogContent.findElementAndClickFunction("btnYes");



    }

    @Then("^Check control error$")
    public void checkControlError() {
        fromContent.checkControl("errorAlert","can't be deleted");
    }
}
