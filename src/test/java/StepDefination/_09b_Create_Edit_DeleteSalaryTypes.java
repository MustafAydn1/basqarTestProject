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

public class _09b_Create_Edit_DeleteSalaryTypes extends Parent {

    dialogContentPOM dialogContent=new dialogContentPOM();
    fromContentPOM fromContent=new fromContentPOM();
    leftNavPOM leftNav=new leftNavPOM();

    @Given("^Navigate to Salary Types Page$")
    public void navigateToSalaryTypesPage(DataTable elements) {
        List<String> clickElements=elements.asList(String.class);
        for (int i = 0; i <clickElements.size() ; i++) {
         leftNav.findElementAndClickFunction(clickElements.get(i));
        }

    }

    @When("^Create a Salary Type$")
    public void createASalaryType(DataTable elements) {
        waiting(1000);
       // fromContent.waitUntilNeed("btnAdd");
        fromContent.findElementAndClickFunction("btnAdd");

        List<List<String >> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {
            dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));
        }

       // dialogContent.findElementAndClickFunction("userTypSalary");
        dialogContent.selectOptions("Tenant Manager Role", "userTypSalary","userTypList");
        dialogContent.findElementAndClickFunction("btnSave");

    }

    @And("^Search Salary Type$")
    public void searchSalaryType(DataTable elements) {

        List<List<String>> sendKeysElements=elements.asLists(String.class);
        for (int i = 0; i <sendKeysElements.size() ; i++) {
        fromContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }


      //  fromContent.selectOptions("Tenant Manager Role","inputSaerchUserType","userTypList");
        fromContent.findElementAndClickFunction("btnSearch");


    }

    @And("^Edit Salary Type$")
    public void editSalaryType(DataTable elements) {
     //   waiting(1000);
        waiting(1000);
        fromContent.waitUntilNeed("editAfterSearch");
        fromContent.findElementAndClickFunction("editAfterSearch");

        List<List<String>> sendKeysElements=elements.asLists(String.class);

        for (int i = 0; i <sendKeysElements.size() ; i++) {
           dialogContent.findElementAndSendKeysFunction(sendKeysElements.get(i).get(0),sendKeysElements.get(i).get(1));

        }
        //dialogContent.findElementAndClickFunction("userTypSalary");
        //dialogContent.selectOptions("Tenant Manager Role", "userTypSalary","userTypList");
       //tek role istiyor
        dialogContent.findElementAndClickFunction("btnSave");

    }

    @And("^Delete Salary Type$")
    public void deleteSalaryType() {
      // fromContent.waitUntilNeed("afterSearchDelete");
        waiting(1000);
      fromContent.findElementAndClickFunction("afterSearchDelete");
      dialogContent.findElementAndClickFunction("btnYes");

    }
}
