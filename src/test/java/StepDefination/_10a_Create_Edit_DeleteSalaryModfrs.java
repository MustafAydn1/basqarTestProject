package StepDefination;

import Pages.Parent;
import Pages.dialogContentPOM;
import Pages.fromContentPOM;
import Pages.leftNavPOM;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class _10a_Create_Edit_DeleteSalaryModfrs extends Parent {

    dialogContentPOM dialogContent = new dialogContentPOM();
    fromContentPOM fromContent = new fromContentPOM();
    leftNavPOM leftNav = new leftNavPOM();
    WebDriver driver;

    @Given("^Navigate to Salary Modifiers Page$")
    public void navigateToSalaryModifiersPage(DataTable elements) {
        List<String> clickElements = elements.asList(String.class);
        for (int i = 0; i < clickElements.size(); i++) {

            leftNav.findElementAndClickFunction(clickElements.get(i));
        }
    }

    @When("^Create a Salary Modifiers with Fixed Value$")
    public void createASalaryModifiersWithFixedValue(DataTable elements) {
        waiting(1000);
        fromContent.findElementAndClickFunction("btnAdd");
        waiting(1000);

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {
            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

            if (count == 1) {
                waiting(1000);
                fromContent.selectOptions("Subtraction", "modfrType", "listModfrsType");
                waiting(2000);
            }
            if (count == 2) {
                fromContent.selectOptions("Fixed Value", "valueTypeModfr", "listvalueTypeModfrs");
            }

            count++;
        }

        dialogContent.findElementAndClickFunction("btnSave");


    }

    @And("^Search Salary Modifiers$")
    public void searchSalaryModifiers(DataTable elements) {
        fromContent.findElementAndClickFunction("backButton");

        List<List<String>> sendKeysElements = elements.asLists(String.class);


        for (int i = 0; i < sendKeysElements.size(); i++) {
            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

        }
      //  fromContent.selectOptions("Subtraction", "searchModifrType", "listModfrsType");
        fromContent.findElementAndClickFunction("btnSearch");



    }

    @And("^Edit Salary Modifier and Delete$")
    public void editSalaryModifier(DataTable elements) {
        waiting(2000);
        // fromContent.waitUntilNeed("editAfterSearch");
        fromContent.findElementAndClickFunction("editAfterSearch");

        List<List<String>> sendKeysElements = elements.asLists(String.class);

        int count = 0;
        for (int i = 0; i < sendKeysElements.size(); i++) {
            fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0), sendKeysElements.get(i).get(1));

            if (count == 1) {
                fromContent.selectOptions("Subtraction", "modfrType", "listModfrsType");
            }
            if (count == 2) {
                fromContent.selectOptions("Fixed Value", "valueTypeModfr", "listvalueTypeModfrs");
            }

            count++;
        }

        dialogContent.findElementAndClickFunction("btnSave");
        waiting(4000);
        fromContent.findElementAndClickFunction("delete");
        dialogContent.findElementAndClickFunction("btnYes");
    }
}