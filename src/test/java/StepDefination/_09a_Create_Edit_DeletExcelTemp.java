package StepDefination;

import Pages.Parent;
import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;

public class _09a_Create_Edit_DeletExcelTemp extends Parent {
    dialogContentPOM dialogContent = new dialogContentPOM();
    fromContentPOM fromContent = new fromContentPOM();
    leftNavPOM leftNav = new leftNavPOM();

    @Given("^Navigate to Excel Template Page$")
    public void navigateToExcelTemplatePage(DataTable elements) {
        List<String> clickElements = elements.asList(String.class);
        for (int i = 0; i < clickElements.size(); i++) {
            leftNav.findElementAndClickFunction(clickElements.get(i));
        }

    }

    @When("^Create a new Budget Excel Template part Budget Template$")
    public void createANewBudgetExcelTemplatePartBudgetTemplate(DataTable elements) {

        fromContent.waitUntilNeed("btnAdd");
        fromContent.findElementAndClickFunction("btnAdd");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        for (int i = 0; i < sendKeysElements.size(); i++) {
            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

        }

        dialogContent.findElementAndClickFunction("btnSave");


    }

    @And("^Create a new Budget Excel Template part Version$")
    public void createANewBudgetExcelTemplatePartVersion(DataTable elements) {

       // dialogContent.waitUntilNeed("excelRow");

        waiting(1000);
        List<List<String>> sendKeysElements = elements.asLists(String.class);
        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {
            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

            if (count == 1) {
                waiting(1000);
                dialogContent.findElementAndClickFunction("addVersion");
                dialogContent.findElementAndClickFunction("excelEdit");
            }

            if (count == 3) {
                waiting(1000);
                dialogContent.findElementAndClickFunction("addVersion");
                dialogContent.findElementAndClickFunction("excelDelete");
                dialogContent.findElementAndClickFunction("btnYes");
                dialogContent.findElementAndClickFunction("btnSave");
                dialogContent.findElementAndClickFunction("closeDialog");

            }

            count++;

        }


    }


    @And("^Delete new Budget Excel Template$")
    public void deleteNewBudgetExcelTemplate(DataTable elements) {
        List<List<String>> sendKeysElements = elements.asLists(String.class);
        for (int i = 0; i < sendKeysElements.size(); i++) {
            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

        }

        fromContent.findElementAndClickFunction("btnSearch");
        waiting(1000);
        fromContent.findElementAndClickFunction("afterSearchBudgExclDel");
        dialogContent.findElementAndClickFunction("btnYes");

    }

}


