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

public class _12_Cretae_Edit_DeleteCostCenterSteps extends Parent {

    dialogContentPOM dialogContent = new dialogContentPOM();
    fromContentPOM fromContent = new fromContentPOM();
    leftNavPOM leftNav = new leftNavPOM();

    @Given("^Navigate to Cost Centers Page$")
    public void navigateToCostCentersPage(DataTable elements) {
        List<String> clickElements = elements.asList(String.class);
        for (int i = 0; i < clickElements.size(); i++) {

            leftNav.findElementAndClickFunction(clickElements.get(i));
        }


    }


    @When("^Create a New Cost Center part1$")
    public void createANewCostCenterpart1(DataTable elements) {
        fromContent.waitUntilNeed("btnAdd");
        fromContent.findElementAndClickFunction("btnAdd");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

            if (count == 1) {
waiting(1000);
             dialogContent.selectOptions("oduct","typeCostCenter","typeCostCentOptions");
                waiting(2000);
             dialogContent.selectOptions("2.6","expensAccout","expensAccOptions");
                waiting(2000);
            }
              // dialogContent.findElementAndClickFunction("constantCostC"); // ve devamının kodları da var.
            count++;
        }
        dialogContent.findElementAndClickFunction("btnSave");
    }


    @And("^Edit and Delete Cost Centers$")
    public void editAndDeleteCostCenters(DataTable elements) {
        waiting(1000);
        fromContent.findElementAndClickFunction("editCostCenter");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));
            if (count == 1) {
                waiting(1000);
                dialogContent.selectOptions("oduct","typeCostCenter","typeCostCentOptions");
                waiting(2000);
                dialogContent.selectOptions("2.6","expensAccout","expensAccOptions");
                waiting(2000);
            }

          count++;
        }

        dialogContent.findElementAndClickFunction("btnSave");
        waiting(1000);
        fromContent.findElementAndClickFunction("deleteCostCenter");
        dialogContent.findElementAndClickFunction("btnYes");

    }
}
