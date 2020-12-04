package StepDefination;

import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class _10b_Created_Edit_DeleteSalaryCons {

    dialogContentPOM dialogContent = new dialogContentPOM();
    fromContentPOM fromContent = new fromContentPOM();
    leftNavPOM leftNav = new leftNavPOM();

    @Given("^Navigate to Salary Constant Page$")
    public void navigateToSalaryConstantPage(DataTable elements) {

        List<String> clickElements = elements.asList(String.class);
        for (int i = 0; i < clickElements.size(); i++) {

            leftNav.findElementAndClickFunction(clickElements.get(i));
        }


    }

    @When("^Create a new Salary Constant$")
    public void createANewSalaryConstant(DataTable elements) {

       // fromContent.waitUntilNeed("btnAdd");
        fromContent.findElementAndClickFunction("btnAdd");
        dialogContent.waitUntilNeed("nameSalaryCons");

        List<List<String>> sendKeysElements=elements.asLists(String.class);
       int count=0;

        for (int i = 0; i <sendKeysElements.size() ; i++) {

        dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        if(count==0)
        {
        dialogContent.findElementAndClickFunction("validSalaryCons");
        dialogContent.findElementAndClickFunction("clickCalender");

        }

        if(count==2) { dialogContent.findElementAndClickFunction("btnSave");}

            count++;

        }
       // dialogContent.findElementAndClickFunction("validSalaryCons");
      //  dialogContent.findElementAndClickFunction("clickCalender");
       // dialogContent.findElementAndClickFunction("btnSave");

    }

    @And("^Search Salary Constant$")
    public void searchSalaryConstant(DataTable elements) {
        List<List<String >> sendKeysElements=elements.asLists(String.class);

        for (int i = 0; i <sendKeysElements.size() ; i++) {

            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }
        fromContent.findElementAndClickFunction("btnSearch");

        fromContent.waitUntilNeed("editAfterSearch");
        fromContent.findElementAndClickFunction("editAfterSearch");

    }

    @When("^Edit this Salary Constant$")
    public void editThisSalaryConstant(DataTable elements) {
        dialogContent.waitUntilNeed("nameSalaryCons");

        List<List<String>> sendKeysElements=elements.asLists(String.class);
        int count=0;

        for (int i = 0; i <sendKeysElements.size() ; i++) {

            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

            if(count==0)
            {
                dialogContent.findElementAndClickFunction("validSalaryCons");
                dialogContent.findElementAndClickFunction("clickCalender");

            }

            if(count==2) { dialogContent.findElementAndClickFunction("btnSave");}

            count++;

        }


    }

    @And("^Delete this Salary Constant$")
    public void deleteThisSalaryConstant(DataTable elements) {

        List<List<String >> sendKeysElements=elements.asLists(String.class);

        for (int i = 0; i <sendKeysElements.size() ; i++) {

            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }

        fromContent.findElementAndClickFunction("btnSearch");
            fromContent.findElementAndClickFunction("afterSearchDelete");
        dialogContent.findElementAndClickFunction("btnYes");


    }
}
