package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class _08_humanRsrcSalary {
    WebDriver driver;
    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
    leftNavPOM leftNav=new leftNavPOM();

    @When("^Go human resources link and create a new position salary$")
    public void goHumanResourcesLinkAndCreateANewPositionSalary(DataTable elements) {
        List<String > clickElements=elements.asList(String.class);

        for (int i = 0; i <clickElements.size() ; i++) {
            leftNav.findElementAndClickFunction(clickElements.get(i));
        }

        fromContent.findElementAndClickFunction("btnAdd");
    }

    @And("^Edit and delete position Salary$")
    public void editAndDeletePositionSalary() {
/*
        List<List<String >> sendKeysElements=elements.asLists(String.class);

        for (int i = 0; i <sendKeysElements.size() ; i++) {
        dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }


 */


        dialogContent.findElementAndSendKeysFunction("inputSalaryName","Mustafa5");
        dialogContent.findElementAndClickFunction("btnSave");

        fromContent.findElementAndSendKeysFunction("inputSearchNameSlry","Mustafa5");
        fromContent.findElementAndClickFunction("btnSearch");

        fromContent.findElementAndClickFunction("btnSalaryEdit");
        dialogContent.findElementAndSendKeysFunction("inputSalaryName","Mehmt");
        dialogContent.findElementAndClickFunction("btnSave");

        fromContent.findElementAndSendKeysFunction("inputSearchNameSlry","Mehmt");
        fromContent.findElementAndClickFunction("btnSearch");

        fromContent.findElementAndClickFunction("afterSearchDelete");
        dialogContent.findElementAndClickFunction("btnYes");



    }
}
